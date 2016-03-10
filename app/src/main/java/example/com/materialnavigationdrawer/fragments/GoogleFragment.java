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
public class GoogleFragment extends BaseFragment {

    @Bind(R.id.googleWebView)
    WebView googleWebView;

    public GoogleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_google, container, false);
        ButterKnife.bind(this, v);
        String url = "https://www.google.co.in";
        googleWebView.loadUrl(url);
        googleWebView.getSettings().setLoadsImagesAutomatically(true);
        googleWebView.getSettings().setJavaScriptEnabled(true);
        googleWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        googleWebView.setWebViewClient(new myWebViewClient());
        return v;
    }

}
