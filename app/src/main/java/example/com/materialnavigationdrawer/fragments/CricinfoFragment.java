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
public class CricinfoFragment extends BaseFragment {

    @Bind(R.id.cricinfoWebView)
    WebView cricinfoWebView;

    public CricinfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_cricinfo, container, false);
        ButterKnife.bind(this, v);

        String url = "http://www.espncricinfo.com/";
        cricinfoWebView.loadUrl(url);
        cricinfoWebView.getSettings().setLoadsImagesAutomatically(true);
        cricinfoWebView.getSettings().setJavaScriptEnabled(true);
        cricinfoWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        cricinfoWebView.setWebViewClient(new myWebViewClient());
        return v;
    }

}
