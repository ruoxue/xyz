package xyz.ruoxue.xyz.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import xyz.ruoxue.xyz.R;
import xyz.ruoxue.xyz.ui.BaseActivity;
import xyz.ruoxue.xyz.ui.presenter.IRegeditPrenter;
import xyz.ruoxue.xyz.ui.presenter.RegeditPrenter;

public class RegeditActivity extends BaseActivity implements View.OnClickListener {


    private IRegeditPrenter regeditPrenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regedit);
        regeditPrenter=new RegeditPrenter(this);

        findViewById(R.id.btn_commit).setOnClickListener(this);
    }

    private EditText getEtUsername() {
        return (EditText) findViewById(R.id.et_username);
    }

    private EditText getEtPwd() {
        return (EditText) findViewById(R.id.et_pwd);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_commit:
                regeditPrenter.regedit(getEtUsername(),getEtPwd());

                break;
        }
    }


}
