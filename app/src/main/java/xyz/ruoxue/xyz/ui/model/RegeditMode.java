package xyz.ruoxue.xyz.ui.model;

import android.content.Context;

import xyz.ruoxue.xyz.bean.UserMode;
import xyz.ruoxue.xyz.net.INet;
import xyz.ruoxue.xyz.net.user.UserApi;
import xyz.ruoxue.xyz.ui.presenter.ICallBack;

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
// | Author: 李上凡 ruoshuisixue@sina.com  创建时间: 2016/4/12_13:34  包名: xyz.ruoxue.xyz.ui.model
// +----------------------------------------------------------------------
public class RegeditMode extends BaseMode
        implements IRegeditMode, INet {
    private Context context;
    private UserMode u;
    private ICallBack callBack;

    public RegeditMode(Context context) {
        this.context = context;
    }


    @Override
    public void regedit(UserMode userMode, ICallBack iCallBack) {
        this.u = userMode;
        this.callBack = iCallBack;
        fetch(FIRST);
    }

    @Override
    public void fetch(int tag) {

        if (FIRST == tag) {
            UserApi.save(u, context, this);
        }

    }

    @Override
    public void response(int tag, Object o) {
        if (o == null) return;
        if (tag == FIRST) {
            callBack.setData(o.toString());
        }
    }
}
