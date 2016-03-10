package example.com.materialnavigationdrawer.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import butterknife.Bind;
import butterknife.ButterKnife;
import example.com.materialnavigationdrawer.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ButterknifeFragment extends BaseFragment {

    @Bind(R.id.butterknifeWebView)
    WebView butterknifeWebView;

    public ButterknifeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_butterknife, container, false);
        ButterKnife.bind(this, v);
        String url = "http://jakewharton.github.io/butterknife/";
        butterknifeWebView.loadUrl(url);
        butterknifeWebView.getSettings().setLoadsImagesAutomatically(true);
        butterknifeWebView.getSettings().setJavaScriptEnabled(true);
        butterknifeWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        butterknifeWebView.setWebViewClient(new myWebViewClient());
        return v;

    }
}