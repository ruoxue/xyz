package xyz.ruoxue.xyz.util;

import android.util.SparseArray;
import android.view.View;

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
// | Author: 李上凡 ruoshuisixue@sina.com  创建时间: 2016/4/12_13:58  包名: xyz.ruoxue.xyz.util
// +----------------------------------------------------------------------
public class ViewHolderUtil {

    public  final  static <T extends View> T  getView(View view,int id){

    SparseArray<View> viewHolder = (SparseArray<View>) view.getTag();
    if (viewHolder == null) {
        viewHolder = new SparseArray<>();
        view.setTag(viewHolder);
    }
    View childView = viewHolder.get(id);
    if (childView == null) {
        childView = view.findViewById(id);
        viewHolder.put(id, childView);
    }
    return (T) childView;}

}
