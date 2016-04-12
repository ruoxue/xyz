package xyz.ruoxue.xyz;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.widget.TextView;

import xyz.ruoxue.xyz.ui.BaseActivity;
import xyz.ruoxue.xyz.ui.presenter.IMainPresenter;
import xyz.ruoxue.xyz.ui.presenter.MainPresenter;

public class MainActivity extends BaseActivity {

    private TextView text;
    private IMainPresenter mainPresenter;

    private ViewPager vp;
    private TabLayout tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mainPresenter=new MainPresenter(this);
    }

    private void initView() {
        vp = (ViewPager) findViewById(R.id.vp);
        tab = (TabLayout) findViewById(R.id.tab);
    }
}
