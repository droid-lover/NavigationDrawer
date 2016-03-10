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
public class MaterialDesignGoogleFragment extends BaseFragment {

    @Bind(R.id.materialDesignWebView)
    WebView materialDesignWebView;

    public MaterialDesignGoogleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_material_design_google, container, false);
        ButterKnife.bind(this, v);
        String url = "https://www.google.com/design/spec/material-design/introduction.html";
        materialDesignWebView.loadUrl(url);
        materialDesignWebView.getSettings().setLoadsImagesAutomatically(true);
        materialDesignWebView.getSettings().setJavaScriptEnabled(true);
        materialDesignWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        materialDesignWebView.setWebViewClient(new BaseFragment.myWebViewClient());
        return v;
    }

}
