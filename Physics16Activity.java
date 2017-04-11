package com.diplom.nck.externaltesting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by N!ck on 09.04.2017.
 */
import static com.diplom.nck.externaltesting.R.drawable.fiz1;
import static com.diplom.nck.externaltesting.R.drawable.fiz2;
import static com.diplom.nck.externaltesting.R.drawable.fiz3;
import static com.diplom.nck.externaltesting.R.drawable.fiz4;
import static com.diplom.nck.externaltesting.R.drawable.fiz5;
import static com.diplom.nck.externaltesting.R.drawable.fiz6;
import static com.diplom.nck.externaltesting.R.drawable.fiz7;
import static com.diplom.nck.externaltesting.R.drawable.fiz8;
import static com.diplom.nck.externaltesting.R.drawable.fiz9;
import static com.diplom.nck.externaltesting.R.drawable.fiz10;
import static com.diplom.nck.externaltesting.R.drawable.fiz11;
import static com.diplom.nck.externaltesting.R.drawable.fiz12;
import static com.diplom.nck.externaltesting.R.drawable.fiz13;
import static com.diplom.nck.externaltesting.R.drawable.fiz14;
import static com.diplom.nck.externaltesting.R.drawable.fiz15;
import static com.diplom.nck.externaltesting.R.drawable.fiz16;
import static com.diplom.nck.externaltesting.R.drawable.fiz17;
import static com.diplom.nck.externaltesting.R.drawable.fiz18;
import static com.diplom.nck.externaltesting.R.drawable.fiz19;
import static com.diplom.nck.externaltesting.R.drawable.fiz20;
import static com.diplom.nck.externaltesting.R.drawable.fiz21;
import static com.diplom.nck.externaltesting.R.drawable.fiz22;
import static com.diplom.nck.externaltesting.R.drawable.fiz23;
import static com.diplom.nck.externaltesting.R.drawable.fiz24;
import static com.diplom.nck.externaltesting.R.drawable.fiz25;
import static com.diplom.nck.externaltesting.R.drawable.fiz26;
import static com.diplom.nck.externaltesting.R.drawable.fiz27;
import static com.diplom.nck.externaltesting.R.drawable.fiz28;
import static com.diplom.nck.externaltesting.R.drawable.fiz29;
import static com.diplom.nck.externaltesting.R.drawable.fiz30;
import static com.diplom.nck.externaltesting.R.drawable.fiz31;
import static com.diplom.nck.externaltesting.R.drawable.fiz32;
import static com.diplom.nck.externaltesting.R.drawable.fiz33;
import static com.diplom.nck.externaltesting.R.drawable.fiz34;


public class Physics16Activity extends AppCompatActivity {
    /**
     * Called when the activity is first created.
     */
    public static final int MAX_POINTS = 200;

    RadioButton answer1;
    RadioButton answer2;
    RadioButton answer3;
    RadioButton answer4;
    RadioButton answer5;
    RadioButton answer6;
    RadioButton answer7;
    RadioButton answer8;
    RadioButton answer9;
    RadioButton answer10;
    RadioButton answer11;
    RadioButton answer12;
    RadioButton answer13;
    RadioButton answer14;
    RadioButton answer15;
    RadioButton answer16;
    RadioButton answer17;
    RadioButton answer18;
    RadioButton answer19;
    RadioButton answer20;
    RadioButton answer21x1;
    RadioButton answer21x2;
    RadioButton answer21x3;
    RadioButton answer21x4;
    RadioButton answer22x1;
    RadioButton answer22x2;
    RadioButton answer22x3;
    RadioButton answer22x4;
    RadioButton answer23x1;
    RadioButton answer23x2;
    RadioButton answer23x3;
    RadioButton answer23x4;
    RadioButton answer24x1;
    RadioButton answer24x2;
    RadioButton answer24x3;
    RadioButton answer24x4;
    EditText answer27;
    EditText answer28;
    EditText answer29;
    EditText answer30;
    EditText answer31;
    EditText answer32;
    EditText answer33;
    EditText answer34;

    EditText answer25a;
    EditText answer25b;
    EditText answer26a;
    EditText answer26b;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LayoutInflater inflater = LayoutInflater.from(this);
        List<View> pages = new ArrayList<View>();

        View page = inflater.inflate(R.layout.phys1_20q, null);
        ImageView img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz1);
        TextView textView = (TextView) page.findViewById(R.id.text_view);
        answer1 = (RadioButton) page.findViewById(R.id.button3);
        textView.setText("Питання № 1");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz2);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer2 = (RadioButton) page.findViewById(R.id.button1);
        textView.setText("Питання № 2");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz3);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer3 = (RadioButton) page.findViewById(R.id.button2);
        textView.setText("Питання № 3");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz4);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer4 = (RadioButton) page.findViewById(R.id.button2);
        textView.setText("Питання № 4");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz5);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer5 = (RadioButton) page.findViewById(R.id.button1);
        textView.setText("Питання № 5");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz6);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer6 = (RadioButton) page.findViewById(R.id.button3);
        textView.setText("Питання № 6");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz7);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer7 = (RadioButton) page.findViewById(R.id.button3);
        textView.setText("Питання № 7");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz8);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer8 = (RadioButton) page.findViewById(R.id.button3);
        textView.setText("Питання № 8");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz9);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer9 = (RadioButton) page.findViewById(R.id.button1);
        textView.setText("Питання № 9");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz10);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer10 = (RadioButton) page.findViewById(R.id.button3);
        textView.setText("Питання № 10");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz11);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer11 = (RadioButton) page.findViewById(R.id.button3);
        textView.setText("Питання № 11");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz12);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer12 = (RadioButton) page.findViewById(R.id.button4);
        textView.setText("Питання № 12");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz13);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer13 = (RadioButton) page.findViewById(R.id.button2);
        textView.setText("Питання № 13");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz14);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer14 = (RadioButton) page.findViewById(R.id.button4);
        textView.setText("Питання № 14");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz15);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer15 = (RadioButton) page.findViewById(R.id.button4);
        textView.setText("Питання № 15");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz16);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer16 = (RadioButton) page.findViewById(R.id.button4);
        textView.setText("Питання № 16");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz17);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer17 = (RadioButton) page.findViewById(R.id.button3);
        textView.setText("Питання № 17");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz18);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer18 = (RadioButton) page.findViewById(R.id.button4);
        textView.setText("Питання № 18");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz19);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer19 = (RadioButton) page.findViewById(R.id.button3);
        textView.setText("Питання № 19");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz20);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer20 = (RadioButton) page.findViewById(R.id.button1);
        textView.setText("Питання № 20");
        pages.add(page);

        page = inflater.inflate(R.layout.math21_25q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz21);
        answer21x1 = (RadioButton) page.findViewById(R.id.button15);
        answer21x2 = (RadioButton) page.findViewById(R.id.button22);
        answer21x3 = (RadioButton) page.findViewById(R.id.button33);
        answer21x4 = (RadioButton) page.findViewById(R.id.button44);
        textView = (TextView) page.findViewById(R.id.text_view);
        textView.setText("Питання № 21");
        pages.add(page);

        page = inflater.inflate(R.layout.math21_25q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz22);
        answer22x1 = (RadioButton) page.findViewById(R.id.button11);
        answer22x2 = (RadioButton) page.findViewById(R.id.button24);
        answer22x3 = (RadioButton) page.findViewById(R.id.button33);
        answer22x4 = (RadioButton) page.findViewById(R.id.button45);
        textView = (TextView) page.findViewById(R.id.text_view);
        textView.setText("Питання № 22");
        pages.add(page);

        page = inflater.inflate(R.layout.math21_25q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz23);
        answer23x1 = (RadioButton) page.findViewById(R.id.button12);
        answer23x2 = (RadioButton) page.findViewById(R.id.button21);
        answer23x3 = (RadioButton) page.findViewById(R.id.button34);
        answer23x4 = (RadioButton) page.findViewById(R.id.button43);
        textView = (TextView) page.findViewById(R.id.text_view);
        textView.setText("Питання № 23");
        pages.add(page);

        page = inflater.inflate(R.layout.math21_25q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz24);
        answer24x1 = (RadioButton) page.findViewById(R.id.button11);
        answer24x2 = (RadioButton) page.findViewById(R.id.button22);
        answer24x3 = (RadioButton) page.findViewById(R.id.button35);
        answer24x4 = (RadioButton) page.findViewById(R.id.button44);
        textView = (TextView) page.findViewById(R.id.text_view);
        textView.setText("Питання № 24");
        pages.add(page);


        page = inflater.inflate(R.layout.math25_26q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz25);
        answer25a = (EditText) page.findViewById(R.id.answ1);
        answer25b = (EditText) page.findViewById(R.id.answ2);
        Button answ = (Button) page.findViewById(R.id.otw);
        answ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcP();
            }
        });
        textView = (TextView) page.findViewById(R.id.text_view);
        textView.setText("Питання № 25");
        pages.add(page);

        page = inflater.inflate(R.layout.math25_26q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz26);
        answer26a = (EditText) page.findViewById(R.id.answ1);
        answer26b = (EditText) page.findViewById(R.id.answ2);
        answ = (Button) page.findViewById(R.id.otw);
        answ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcP();
            }
        });
        textView = (TextView) page.findViewById(R.id.text_view);
        textView.setText("Питання № 26");
        pages.add(page);

        page = inflater.inflate(R.layout.math27_30, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz27);
        answer27 = (EditText) page.findViewById(R.id.answ1);
        answ = (Button) page.findViewById(R.id.otw);
        answ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcP();
            }
        });
        textView = (TextView) page.findViewById(R.id.text_view);
        textView.setText("Питання № 27");
        pages.add(page);

        page = inflater.inflate(R.layout.math27_30, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz28);
        answer28 = (EditText) page.findViewById(R.id.answ1);
        answ = (Button) page.findViewById(R.id.otw);
        answ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcP();
            }
        });
        textView = (TextView) page.findViewById(R.id.text_view);
        textView.setText("Питання № 28");
        pages.add(page);

        page = inflater.inflate(R.layout.math27_30, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz29);
        answer29 = (EditText) page.findViewById(R.id.answ1);
        answ = (Button) page.findViewById(R.id.otw);
        answ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcP();
            }
        });
        textView = (TextView) page.findViewById(R.id.text_view);
        textView.setText("Питання № 29");
        pages.add(page);

        page = inflater.inflate(R.layout.math27_30, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz30);
        answer30 = (EditText) page.findViewById(R.id.answ1);
        answ = (Button) page.findViewById(R.id.otw);
        answ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcP();
            }
        });
        textView = (TextView) page.findViewById(R.id.text_view);
        textView.setText("Питання № 30");
        pages.add(page);

        page = inflater.inflate(R.layout.math27_30, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz31);
        answer31 = (EditText) page.findViewById(R.id.answ1);
        answ = (Button) page.findViewById(R.id.otw);
        answ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcP();
            }
        });
        textView = (TextView) page.findViewById(R.id.text_view);
        textView.setText("Питання № 31");
        pages.add(page);

        page = inflater.inflate(R.layout.math27_30, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz32);
        answer32 = (EditText) page.findViewById(R.id.answ1);
        answ = (Button) page.findViewById(R.id.otw);
        answ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcP();
            }
        });
        textView = (TextView) page.findViewById(R.id.text_view);
        textView.setText("Питання № 32");
        pages.add(page);

        page = inflater.inflate(R.layout.math27_30, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz33);
        answer33 = (EditText) page.findViewById(R.id.answ1);
        answ = (Button) page.findViewById(R.id.otw);
        answ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcP();
            }
        });
        textView = (TextView) page.findViewById(R.id.text_view);
        textView.setText("Питання № 33");
        pages.add(page);

        page = inflater.inflate(R.layout.math27_30, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(fiz34);
        answer34 = (EditText) page.findViewById(R.id.answ1);
        answ = (Button) page.findViewById(R.id.otw);
        answ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcP();
            }
        });
        textView = (TextView) page.findViewById(R.id.text_view);
        textView.setText("Питання № 34");
        pages.add(page);

        SamplePagerAdapter pagerAdapter = new SamplePagerAdapter(pages);
        ViewPager viewPager = new ViewPager(this);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(0);
        setContentView(viewPager);
    }

    public int calcP() {
        int points = 0;
        if (answer1.isChecked()) {
            points++;
        }
        if (answer2.isChecked()) {
            points++;
        }
        if (answer3.isChecked()) {
            points++;
        }
        if (answer4.isChecked()) {
            points++;
        }
        if (answer5.isChecked()) {
            points++;
        }
        if (answer6.isChecked()) {
            points++;
        }
        if (answer7.isChecked()) {
            points++;
        }
        if (answer8.isChecked()) {
            points++;
        }
        if (answer9.isChecked()) {
            points++;
        }
        if (answer10.isChecked()) {
            points++;
        }
        if (answer11.isChecked()) {
            points++;
        }
        if (answer12.isChecked()) {
            points++;
        }
        if (answer13.isChecked()) {
            points++;
        }
        if (answer14.isChecked()) {
            points++;
        }
        if (answer15.isChecked()) {
            points++;
        }
        if (answer16.isChecked()) {
            points++;
        }
        if (answer17.isChecked()) {
            points++;
        }
        if (answer18.isChecked()) {
            points++;
        }
        if (answer19.isChecked()) {
            points++;
        }
        if (answer20.isChecked()) {
            points++;
        }
        if (answer21x1.isChecked()) {
            points++;
        }
        if (answer21x2.isChecked()) {
            points++;
        }
        if (answer21x3.isChecked()) {
            points++;
        }
        if (answer21x4.isChecked()) {
            points++;
        }
        if (answer22x1.isChecked()) {
            points++;
        }
        if (answer22x2.isChecked()) {
            points++;
        }
        if (answer22x3.isChecked()) {
            points++;
        }
        if (answer22x4.isChecked()) {
            points++;
        }
        if (answer23x1.isChecked()) {
            points++;
        }
        if (answer23x2.isChecked()) {
            points++;
        }
        if (answer23x3.isChecked()) {
            points++;
        }
        if (answer23x4.isChecked()) {
            points++;
        }
        if (answer24x1.isChecked()) {
            points++;
        }
        if (answer24x2.isChecked()) {
            points++;
        }
        if (answer24x3.isChecked()) {
            points++;
        }
        if (answer24x4.isChecked()) {
            points++;
        }
        if (answer25a.getText().toString().trim().equals("8") && answer25b.getText().toString().trim().equals("40")) {
            points++;
        }
        if (answer26a.getText().toString().trim().equals("1062.5") && answer26b.getText().toString().trim().equals("6.25")) {
            points++;
        }
        if (answer27.getText().toString().trim().equals("27")) {
            points++;
        }
        if (answer28.getText().toString().trim().equals("22")) {
            points++;
        }
        if (answer29.getText().toString().trim().equals("400")) {
            points++;
        }
        if (answer30.getText().toString().trim().equals("30")) {
            points++;
        }
        if (answer31.getText().toString().trim().equals("0.6")) {
            points++;
        }
        if (answer32.getText().toString().trim().equals("20")) {
            points++;
        }
        if (answer33.getText().toString().trim().equals("40")) {
            points++;
        }
        if (answer34.getText().toString().trim().equals("3")) {
            points++;
        }

        return points;
    }

    public void onSubmit(View view) {
        Intent i = new Intent(this, CongratulationActivity.class);
        i.putExtra("actualPoints", calcP());
        i.putExtra("maxPoints", MAX_POINTS);
        startActivity(i);
    }
}

