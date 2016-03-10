// Generated code from Butter Knife. Do not modify!
package example.com.materialnavigationdrawer.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class GoogleFragment$$ViewBinder<T extends example.com.materialnavigationdrawer.fragments.GoogleFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492983, "field 'googleWebView'");
    target.googleWebView = finder.castView(view, 2131492983, "field 'googleWebView'");
  }

  @Override public void unbind(T target) {
    target.googleWebView = null;
  }
}
