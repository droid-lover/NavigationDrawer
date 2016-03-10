package example.com.materialnavigationdrawer.fragments;

import android.support.v4.app.Fragment;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by jarvis on 09-Mar-16
 * at  3:10 PM .
 */
public class BaseFragment extends Fragment {

    public class myWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
