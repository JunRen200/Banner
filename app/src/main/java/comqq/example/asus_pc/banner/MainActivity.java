package comqq.example.asus_pc.banner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private Banner banner;
    //设置图片资源:url或本地资源



//    {
//        "http://218.192.170.132/BS80.jpg",
//                "http://img.zcool.cn/community/0166c756e1427432f875520f7cc838.jpg",
//                "http://img.zcool.cn/community/018fdb56e1428632f875520f7b67cb.jpg",
//                "http://img.zcool.cn/community/01c8dc56e1428e6ac72531cbaa5f2c.jpg",
//                "http://img.zcool.cn/community/01fda356640b706ac725b2c8b99b08.jpg",
//                "http://img.zcool.cn/community/01fd2756e142716ac72531cbf8bbbf.jpg",
//                "http://img.zcool.cn/community/0114a856640b6d32f87545731c076a.jpg"};


    String[] titles=new String[]{"十大星级品牌联盟，全场2折起","全场2折起","十大星级品牌联盟","嗨购5折不要停","12趁现在","嗨购5折不要停，12.12趁现在","实打实大顶顶顶顶"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List a= new ArrayList<>();
        a.add("http://img.zcool.cn/community/0166c756e1427432f875520f7cc838.jpg");
        a.add("http://img.zcool.cn/community/018fdb56e1428632f875520f7b67cb.jpg");
        banner = (Banner) findViewById(R.id.banner);
        banner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        banner.setImages(a);
        //banner设置方法全部调用完毕时最后调用
        banner.start();

    }
    //如果你需要考虑更好的体验，可以这么操作
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("--", "onStart");
        banner.isAutoPlay(true);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("--", "onStop");
        banner.isAutoPlay(false);
    }
}
