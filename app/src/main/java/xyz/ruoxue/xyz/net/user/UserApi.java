package xyz.ruoxue.xyz.net.user;

import android.content.Context;

import xyz.ruoxue.xyz.bean.UserMode;
import xyz.ruoxue.xyz.config.TableNameConfig;
import xyz.ruoxue.xyz.net.Post;
import xyz.ruoxue.xyz.ui.model.BaseMode;

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
// | Author: 李上凡 ruoshuisixue@sina.com  创建时间: 2016/4/12_11:24  包名: xyz.ruoxue.xyz.net.user
// +----------------------------------------------------------------------
public class UserApi {
    public static void save(UserMode userMode, Context context, BaseMode baseMode) {
        userMode.setTableName(TableNameConfig.USER);
        Post.newInstance().postSave(userMode, context, null,baseMode);
    }
    public static void query(Class clazz, Context context) {
        Post.newInstance().postQuery(context, clazz, TableNameConfig.USER);

    }

}
