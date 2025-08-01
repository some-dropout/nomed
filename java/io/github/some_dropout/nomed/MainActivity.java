package io.github.some_dropout.nomed;

import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
  @Override
  public void onCreate(Bundle bundle)
  {
    AssetManager assMan;
    String fontPath;
    Typeface face;
    EditText txt;

    super.onCreate(bundle);
    setContentView(R.layout.main_activity);

    assMan = getAssets();
    fontPath = getString(R.string.font_path);
    try
    {
      face = Typeface.createFromAsset(assMan, fontPath);
    }
    catch (RuntimeException exc)
    {
      exc.printStackTrace();
      Toast.makeText(this, R.string.err_font, Toast.LENGTH_SHORT).show();
      finish();
      return;
    }
    txt = findViewById(R.id.txt);
    txt.setTypeface(face);
  }
}
