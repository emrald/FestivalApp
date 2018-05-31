package trivedi.festivalapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by TI A1 on 03-01-2017.
 */
public class ActivityMyOrders extends ContentFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1,
                container, false);
        return view;
    }
}

