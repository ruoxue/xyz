package xyz.ruoxue.xyz.net;

import android.content.Context;
import android.widget.Toast;

import com.socks.library.KLog;

import org.json.JSONArray;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.listener.FindCallback;
import cn.bmob.v3.listener.SaveListener;
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
// | Author: 李上凡 ruoshuisixue@sina.com  创建时间: 2016/4/12_11:07  包名: xyz.ruoxue.xyz.net
// +----------------------------------------------------------------------
public class Post {

    private  static Post post;


    private  Post(){}
    public static  Post newInstance(){
        if (post==null){
            synchronized (Post.class){
                if (post==null){
                    post=new Post();
                }
            }
        }

        return  post;
    }


    public   void postSave(Object obj, final Context context, Class clazz, BaseMode mode) {
        if (obj instanceof BmobObject) {
            ((BmobObject) obj).save(context, new SaveListener() {
                @Override
                public void onSuccess() {
                    KLog.i("ok");
                    Toast.makeText(context, "ok", Toast.LENGTH_SHORT).show();



                }

                @Override
                public void onFailure(int i, String s) {
                    KLog.e(s);
                }
            });
        }


    }


    public   void postQuery( Context context, Class clazz,String tableName) {
        BmobQuery query = new BmobQuery(tableName);
        query.findObjects(context, new FindCallback() {
            @Override
            public void onSuccess(JSONArray jsonArray) {
                KLog.i("ruoxue",jsonArray);
            }

            @Override
            public void onFailure(int i, String s) {
                KLog.i("ruoxue",s);
            }
        });


    }


}
