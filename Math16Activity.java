package com.diplom.nck.externaltesting;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.ceylonlabs.imageviewpopup.ImagePopup;

import java.util.ArrayList;
import java.util.List;

import static com.diplom.nck.externaltesting.R.drawable.math16a;
import static com.diplom.nck.externaltesting.R.drawable.math16b;
import static com.diplom.nck.externaltesting.R.drawable.math16c;
import static com.diplom.nck.externaltesting.R.drawable.math16d;
import static com.diplom.nck.externaltesting.R.drawable.math16e;
import static com.diplom.nck.externaltesting.R.drawable.math16f;
import static com.diplom.nck.externaltesting.R.drawable.math16g;
import static com.diplom.nck.externaltesting.R.drawable.math16h;
import static com.diplom.nck.externaltesting.R.drawable.math16i;
import static com.diplom.nck.externaltesting.R.drawable.math16j;
import static com.diplom.nck.externaltesting.R.drawable.math16k;
import static com.diplom.nck.externaltesting.R.drawable.math16l;
import static com.diplom.nck.externaltesting.R.drawable.math16m;
import static com.diplom.nck.externaltesting.R.drawable.math16n;
import static com.diplom.nck.externaltesting.R.drawable.math16o;
import static com.diplom.nck.externaltesting.R.drawable.math16p;
import static com.diplom.nck.externaltesting.R.drawable.math16q;
import static com.diplom.nck.externaltesting.R.drawable.math16r;
import static com.diplom.nck.externaltesting.R.drawable.math16s;
import static com.diplom.nck.externaltesting.R.drawable.math16t;
import static com.diplom.nck.externaltesting.R.drawable.math16u1;
import static com.diplom.nck.externaltesting.R.drawable.math16u2;
import static com.diplom.nck.externaltesting.R.drawable.math16u3;
import static com.diplom.nck.externaltesting.R.drawable.math16u4;
import static com.diplom.nck.externaltesting.R.drawable.math16u5;
import static com.diplom.nck.externaltesting.R.drawable.math16x27;
import static com.diplom.nck.externaltesting.R.drawable.math16x28;
import static com.diplom.nck.externaltesting.R.drawable.math16x29;
import static com.diplom.nck.externaltesting.R.drawable.math16x30;
import static com.diplom.nck.externaltesting.R.drawable.math26;


public class Math16Activity extends AppCompatActivity {
    /** Called when the activity is first created. */
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

    EditText answer25a;
    EditText answer25b;
    EditText answer26a;
    EditText answer26b;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LayoutInflater inflater = LayoutInflater.from(this);
        List<View> pages = new ArrayList<View>();

        View page = inflater.inflate(R.layout.math1_20q, null);
        ImageView img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(math16a);
        TextView textView = (TextView) page.findViewById(R.id.text_view);
        answer1 = (RadioButton) page.findViewById(R.id.button2);
        textView.setText("Питання № 1");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(math16b);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer2 = (RadioButton) page.findViewById(R.id.button5);
        textView.setText("Питання № 2");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(math16c);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer3 = (RadioButton) page.findViewById(R.id.button3);
        textView.setText("Питання № 3");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(math16d);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer4 = (RadioButton) page.findViewById(R.id.button2);
        textView.setText("Питання № 4");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(math16e);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer5 = (RadioButton) page.findViewById(R.id.button4);
        textView.setText("Питання № 5");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(math16f);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer6 = (RadioButton) page.findViewById(R.id.button4);
        textView.setText("Питання № 6");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(math16g);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer7 = (RadioButton) page.findViewById(R.id.button1);
        textView.setText("Питання № 7");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(math16h);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer8 = (RadioButton) page.findViewById(R.id.button3);
        textView.setText("Питання № 8");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(math16i);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer9 = (RadioButton) page.findViewById(R.id.button4);
        textView.setText("Питання № 9");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(math16j);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer10 = (RadioButton) page.findViewById(R.id.button5);
        textView.setText("Питання № 10");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(math16k);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer11 = (RadioButton) page.findViewById(R.id.button4);
        textView.setText("Питання № 11");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(math16l);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer12 = (RadioButton) page.findViewById(R.id.button3);
        textView.setText("Питання № 12");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(math16m);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer13 = (RadioButton) page.findViewById(R.id.button1);
        textView.setText("Питання № 13");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(math16n);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer14 = (RadioButton) page.findViewById(R.id.button5);
        textView.setText("Питання № 14");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(math16o);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer15 = (RadioButton) page.findViewById(R.id.button1);
        textView.setText("Питання № 15");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(math16p);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer16 = (RadioButton) page.findViewById(R.id.button2);
        textView.setText("Питання № 16");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(math16q);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer17 = (RadioButton) page.findViewById(R.id.button1);
        textView.setText("Питання № 17");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(math16r);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer18 = (RadioButton) page.findViewById(R.id.button5);
        textView.setText("Питання № 18");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(math16s);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer19 = (RadioButton) page.findViewById(R.id.button1);
        textView.setText("Питання № 19");
        pages.add(page);

        page = inflater.inflate(R.layout.math1_20q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(math16t);
        textView = (TextView) page.findViewById(R.id.text_view);
        answer20 = (RadioButton) page.findViewById(R.id.button4);
        textView.setText("Питання № 20");
        pages.add(page);

        page = inflater.inflate(R.layout.math21_25q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(math16u1);
        answer21x1 = (RadioButton) page.findViewById(R.id.button11);
        answer21x2 = (RadioButton) page.findViewById(R.id.button22);
        answer21x3 = (RadioButton) page.findViewById(R.id.button34);
        answer21x4 = (RadioButton) page.findViewById(R.id.button43);
        textView = (TextView) page.findViewById(R.id.text_view);
        textView.setText("Питання № 21");
        pages.add(page);

        page = inflater.inflate(R.layout.math21_25q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(math16u2);
        answer22x1 = (RadioButton) page.findViewById(R.id.button15);
        answer22x2 = (RadioButton) page.findViewById(R.id.button21);
        answer22x3 = (RadioButton) page.findViewById(R.id.button34);
        answer22x4 = (RadioButton) page.findViewById(R.id.button42);
        textView = (TextView) page.findViewById(R.id.text_view);
        textView.setText("Питання № 22");
        pages.add(page);

        page = inflater.inflate(R.layout.math21_25q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(math16u3);
        answer23x1 = (RadioButton) page.findViewById(R.id.button13);
        answer23x2 = (RadioButton) page.findViewById(R.id.button22);
        answer23x3 = (RadioButton) page.findViewById(R.id.button31);
        answer23x4 = (RadioButton) page.findViewById(R.id.button44);
        textView = (TextView) page.findViewById(R.id.text_view);
        textView.setText("Питання № 23");
        pages.add(page);

        page = inflater.inflate(R.layout.math21_25q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(math16u4);
        answer24x1 = (RadioButton) page.findViewById(R.id.button14);
        answer24x2 = (RadioButton) page.findViewById(R.id.button22);
        answer24x3 = (RadioButton) page.findViewById(R.id.button31);
        answer24x4 = (RadioButton) page.findViewById(R.id.button45);
        textView = (TextView) page.findViewById(R.id.text_view);
        textView.setText("Питання № 24");
        pages.add(page);


        page = inflater.inflate(R.layout.math25_26q, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(math16u5);
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
        img.setImageResource(math26);
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
        img.setImageResource(math16x27);
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
        img.setImageResource(math16x28);
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
        img.setImageResource(math16x29);
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
        img.setImageResource(math16x30);
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
        if (answer25a.getText().toString().trim().equals("700") && answer25b.getText().toString().trim().equals("140")) {
          points++;
       }
         if (answer26a.getText().toString().trim().equals("6.5") && answer26b.getText().toString().trim().equals("13")) {
         points++;
         }
        if (answer27.getText().toString().trim().equals("-0.75")) {
            points++;
        }
        if (answer28.getText().toString().trim().equals("46")) {
            points++;
        }
        if (answer29.getText().toString().trim().equals("18")) {
            points++;
        }
        if (answer30.getText().toString().trim().equals("21")) {
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