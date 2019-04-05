package al.tong.mon.databindingobservable;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class ObservableItem extends BaseObservable {

    private String name;
    private String nickName;

    @Bindable
    public String getName() {
        return name;
    }

    @Bindable
    public String getNickName() {
        return nickName;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
        notifyPropertyChanged(BR.nickName);
    }
}
