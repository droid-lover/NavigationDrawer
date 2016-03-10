// Generated code from Butter Knife. Do not modify!
package example.com.materialnavigationdrawer.activities;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends example.com.materialnavigationdrawer.activities.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492970, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131492970, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131492972, "field 'navigationView'");
    target.navigationView = finder.castView(view, 2131492972, "field 'navigationView'");
  }

  @Override public void unbind(T target) {
    target.toolbar = null;
    target.navigationView = null;
  }
}
