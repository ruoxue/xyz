package xyz.ruoxue.xyz.ui.presenter;

import android.content.Context;
import android.content.Intent;

import xyz.ruoxue.xyz.ui.activity.RegeditActivity;

// +----------------------------------------------------------------------
//            -------------------------
//           /   / ----------------\  \
//          /   /             \  \
//         /   /              /  /
//        /   /    /-------------- /  /
//       /   /    /-------------------\  \
//      /   /                   \  \
//     /   /                     \  \
//    /   /                      /  /
//   /   /      /----------------------- /  /
//  /-----/      /---------------------------/
// +----------------------------------------------------------------------
// | Copyright (c) 2016 http://baimifan.cn All rights reserved.
// +----------------------------------------------------------------------
// | Author: // +----------------------------------------------------------------------
// +----------------------------------------------------------------------
//            -------------------------
//           /   / ----------------\  \
//          /   /             \  \
//         /   /              /  /
//        /   /    /-------------- /  /
//       /   /    /-------------------\  \
//      /   /                   \  \
//     /   /                     \  \
//    /   /                      /  /
//   /   /      /----------------------- /  /
//  /-----/      /---------------------------/
// +----------------------------------------------------------------------
// | Copyright (c) 2016 http://baimifan.cn All rights reserved.
// +----------------------------------------------------------------------
// | Author: 李上凡 ruoshuisixue@sina.com  创建时间: 2016/4/12_12:00  包名: xyz.ruoxue.xyz.ui.presenter
// +----------------------------------------------------------------------
public class MainPresenter implements  IMainPresenter {


    private Context context;

    public MainPresenter(Context context) {
        this.context = context;
    }

    @Override
    public void onClick() {

    }

    @Override
    public void query(Object o, Context  context) {
      context.startActivity(new Intent(context, RegeditActivity.class));
    }
}
