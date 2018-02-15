package pingo.betnek.testproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText firstLetterField;
    private EditText secondLetterField;
    private Button checkAnagramBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.checkAnagramBtn = findViewById(R.id.checkAnagram);
        this.secondLetterField = findViewById(R.id.second_letter);
        this.firstLetterField = findViewById(R.id.first_letter);

        checkAnagramBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.checkAnagram:

                if (isValid()) {
                    checkAnagramAlgo();
                }
                break;

        }
    }


    /**
     * Check strings are they are anagram or not
     */
    private void checkAnagramAlgo() {

        checkAnagramBtn.setEnabled(false);
        String firstWord = firstLetterField.getText().toString().trim();
        String secondWord = secondLetterField.getText().toString().trim();

        if (firstWord.length() != secondWord.length()) {

            AppUtils.showShortToast(R.string.anagram_failed);

        } else {

            char[] firstWordArray = firstWord.toCharArray();
            char[] secondWordArray = secondWord.toCharArray();

            Arrays.sort(firstWordArray);
            Arrays.sort(secondWordArray);

            if (Arrays.equals(firstWordArray, secondWordArray)) {
                AppUtils.showShortToast(R.string.anagram_success);
            } else {
                AppUtils.showShortToast(R.string.anagram_failed);
            }
        }

        checkAnagramBtn.setEnabled(true);
    }


    /**
     * Check if both strings are not empty
     *
     * @return true if strings are not empty else false
     */
    private boolean isValid() {

        if (TextUtils.isEmpty(firstLetterField.getText())) {
            AppUtils.showShortToast(R.string.enter_first_letter);
            return false;
        }

        if (TextUtils.isEmpty(secondLetterField.getText())) {
            AppUtils.showShortToast(R.string.enter_second_letter);
            return false;
        }

        return true;
    }
}
