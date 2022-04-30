// Generated by view binder compiler. Do not edit!
package com.belajar.resepmakanan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.belajar.resepmakanan.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MenuItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView keyMenu;

  @NonNull
  public final TextView selengkapnya;

  @NonNull
  public final TextView titleMasakan;

  @NonNull
  public final CircleImageView tumbnalImage;

  private MenuItemBinding(@NonNull LinearLayout rootView, @NonNull TextView keyMenu,
      @NonNull TextView selengkapnya, @NonNull TextView titleMasakan,
      @NonNull CircleImageView tumbnalImage) {
    this.rootView = rootView;
    this.keyMenu = keyMenu;
    this.selengkapnya = selengkapnya;
    this.titleMasakan = titleMasakan;
    this.tumbnalImage = tumbnalImage;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MenuItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MenuItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.menu_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MenuItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.key_menu;
      TextView keyMenu = ViewBindings.findChildViewById(rootView, id);
      if (keyMenu == null) {
        break missingId;
      }

      id = R.id.selengkapnya;
      TextView selengkapnya = ViewBindings.findChildViewById(rootView, id);
      if (selengkapnya == null) {
        break missingId;
      }

      id = R.id.title_masakan;
      TextView titleMasakan = ViewBindings.findChildViewById(rootView, id);
      if (titleMasakan == null) {
        break missingId;
      }

      id = R.id.tumbnal_image;
      CircleImageView tumbnalImage = ViewBindings.findChildViewById(rootView, id);
      if (tumbnalImage == null) {
        break missingId;
      }

      return new MenuItemBinding((LinearLayout) rootView, keyMenu, selengkapnya, titleMasakan,
          tumbnalImage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
