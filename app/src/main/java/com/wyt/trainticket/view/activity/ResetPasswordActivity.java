package com.wyt.trainticket.view.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.love_cookies.cookie_library.activity.BaseActivity;
import com.wyt.trainticket.R;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;

/**
 * Created by cookie on 2017/3/21 0021.
 * <p>
 * 修改密码页
 */
@ContentView(R.layout.activity_reset_password)
public class ResetPasswordActivity extends BaseActivity {

    @ViewInject(R.id.title_tv)
    private TextView titleTv;
    @ViewInject(R.id.left_btn)
    private ImageView leftBtn;
    @ViewInject(R.id.old_password_et)
    private EditText oldPasswordEt;
    @ViewInject(R.id.new_password_et)
    private EditText newPasswordEt;
    @ViewInject(R.id.re_new_password_et)
    private EditText reNewPasswordEt;
    @ViewInject(R.id.submit_btn)
    private TextView submitBtn;

    /**
     * 初始化控件
     *
     * @param savedInstanceState
     */
    @Override
    public void initWidget(Bundle savedInstanceState) {
        //设置Title
        titleTv.setText(R.string.reset_password);
        //设置Title左按钮
        leftBtn.setImageResource(R.drawable.ic_keyboard_backspace_white);
        //添加按钮点击事件
        leftBtn.setOnClickListener(this);
        submitBtn.setOnClickListener(this);
    }

    /**
     * 控件点击事件
     *
     * @param view
     */
    @Override
    public void widgetClick(View view) {
        switch (view.getId()) {
            case R.id.left_btn:
                finish();
                break;
            case R.id.submit_btn:
                break;
            default:
                break;
        }
    }
}