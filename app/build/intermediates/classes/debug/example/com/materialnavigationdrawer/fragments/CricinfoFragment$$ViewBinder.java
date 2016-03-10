// Generated code from Butter Knife. Do not modify!
package example.com.materialnavigationdrawer.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CricinfoFragment$$ViewBinder<T extends example.com.materialnavigationdrawer.fragments.CricinfoFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492982, "field 'cricinfoWebView'");
    target.cricinfoWebView = finder.castView(view, 2131492982, "field 'cricinfoWebView'");
  }

  @Override public void unbind(T target) {
    target.cricinfoWebView = null;
  }
}
