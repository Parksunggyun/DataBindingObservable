package al.tong.mon.databindingobservable;

        import android.databinding.DataBindingUtil;
        import android.os.Handler;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;

        import al.tong.mon.databindingobservable.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        final ObservableItem item = new ObservableItem();
        item.setName("박성균");
        item.setNickName("알통몬");
        binding.setItem(item);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                item.setName("박이레");
                item.setNickName("근육몬");
            }
        }, 3000);
    }


}
