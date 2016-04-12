package xyz.ruoxue.xyz.ui.presenter;

import android.content.Context;
import android.widget.EditText;

import xyz.ruoxue.xyz.bean.UserMode;
import xyz.ruoxue.xyz.ui.model.IRegeditMode;
import xyz.ruoxue.xyz.ui.model.RegeditMode;

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
// | Author: 李上凡 ruoshuisixue@sina.com  创建时间: 2016/4/12_13:26  包名: xyz.ruoxue.xyz.ui.activity
// +----------------------------------------------------------------------
public class RegeditPrenter implements IRegeditPrenter {
    private  Context context;
    private IRegeditMode regeditMode;


    public RegeditPrenter(Context context) {
        this.context=context;
        regeditMode=new RegeditMode(context);
    }


    @Override
    public void regedit(EditText etUsername, EditText etPwd) {
        UserMode u=new UserMode();
        u.setName(etUsername.getText().toString().trim());
        u.setPwd(etPwd.getText().toString().trim());

        regeditMode.regedit(u,new ICallBack(){
            @Override
            public void setData(String s) {

            }
        });




    }
}
