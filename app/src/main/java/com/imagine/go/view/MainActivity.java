package com.imagine.go.view;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 测试文字随进度移动的进度条
 *
 * @author Jinhu
 * @date 16-7-19
 */
public class MainActivity extends AppCompatActivity {


    /* 城市名 .*/
    private final String[] mCityName = {"广州市", "惠州市", "深圳市", "上海市", "北京市", "成都市"};

    /* 城市列表 .*/
    private ListView mCityList;

    /* 城市列表适配器 .*/
    private MyAdapter mAdapter;

    /* 文字进度条 .*/
    private TextProgressBar mTxtProgressBar;


    private Handler mHandler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            if (msg.what == 0x101) {
                //计时设置进度
                new Timer().schedule(new TimerTask() {
                    int i = 1;

                    @Override
                    public void run() {
                        mTxtProgressBar.setProgress(i);
                        i++;
                    }
                }, 0, 500);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCityList = (ListView) findViewById(R.id.id_listView);
        mAdapter = new MyAdapter();
        mCityList.setAdapter(mAdapter);
    }


    class MyAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return mCityName.length;
        }

        @Override
        public Object getItem(int i) {
            return mCityName[i];
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View itemView = LayoutInflater.from(MainActivity.this).inflate(R.layout.item_city, null);
            TextView mCityNameView = (TextView) itemView.findViewById(R.id.id_textView_cityName);
            mCityNameView.setText(mCityName[i]);

            //设置第1个列表项的进度条
            if (i == 0) {
                mTxtProgressBar = (TextProgressBar) itemView.findViewById(R.id.id_txtProgress);
                mHandler.sendEmptyMessage(0x101);
            }
            return itemView;
        }
    }
}
