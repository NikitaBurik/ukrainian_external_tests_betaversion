package com.diplom.nck.externaltesting;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by N!ck on 10.04.2017.
 */
import static com.diplom.nck.externaltesting.R.drawable.ukr1;
import static com.diplom.nck.externaltesting.R.drawable.ukr16;
import static com.diplom.nck.externaltesting.R.drawable.ukr2;
import static com.diplom.nck.externaltesting.R.drawable.ukr3;
import static com.diplom.nck.externaltesting.R.drawable.ukr4;
import static com.diplom.nck.externaltesting.R.drawable.ukr5;
import static com.diplom.nck.externaltesting.R.drawable.ukr57;
import static com.diplom.nck.externaltesting.R.drawable.ukr6;
import static com.diplom.nck.externaltesting.R.drawable.ukr7;
import static com.diplom.nck.externaltesting.R.drawable.ukr8;
import static com.diplom.nck.externaltesting.R.drawable.ukr9;
import static com.diplom.nck.externaltesting.R.drawable.ukr10;
import static com.diplom.nck.externaltesting.R.drawable.ukr11;
import static com.diplom.nck.externaltesting.R.drawable.ukr12;
import static com.diplom.nck.externaltesting.R.drawable.ukr13;
import static com.diplom.nck.externaltesting.R.drawable.ukr14;
import static com.diplom.nck.externaltesting.R.drawable.ukr15;
import static com.diplom.nck.externaltesting.R.drawable.fiz16;
import static com.diplom.nck.externaltesting.R.drawable.ukr17;
import static com.diplom.nck.externaltesting.R.drawable.ukr18;
import static com.diplom.nck.externaltesting.R.drawable.ukr19;
import static com.diplom.nck.externaltesting.R.drawable.ukr20;
import static com.diplom.nck.externaltesting.R.drawable.ukr21;
import static com.diplom.nck.externaltesting.R.drawable.ukr22;
import static com.diplom.nck.externaltesting.R.drawable.ukr23;
import static com.diplom.nck.externaltesting.R.drawable.ukr24;
import static com.diplom.nck.externaltesting.R.drawable.ukr25;
import static com.diplom.nck.externaltesting.R.drawable.ukr26;
import static com.diplom.nck.externaltesting.R.drawable.ukr27;
import static com.diplom.nck.externaltesting.R.drawable.ukr28;
import static com.diplom.nck.externaltesting.R.drawable.ukr29;
import static com.diplom.nck.externaltesting.R.drawable.ukr30;
import static com.diplom.nck.externaltesting.R.drawable.ukr31;
import static com.diplom.nck.externaltesting.R.drawable.ukr32;
import static com.diplom.nck.externaltesting.R.drawable.ukr33;
import static com.diplom.nck.externaltesting.R.drawable.ukr34;
import static com.diplom.nck.externaltesting.R.drawable.ukr35;
import static com.diplom.nck.externaltesting.R.drawable.ukr36;
import static com.diplom.nck.externaltesting.R.drawable.ukr37;
import static com.diplom.nck.externaltesting.R.drawable.ukr38;
import static com.diplom.nck.externaltesting.R.drawable.ukr39;
import static com.diplom.nck.externaltesting.R.drawable.ukr40;
import static com.diplom.nck.externaltesting.R.drawable.ukr41;
import static com.diplom.nck.externaltesting.R.drawable.ukr42;
import static com.diplom.nck.externaltesting.R.drawable.ukr43;
import static com.diplom.nck.externaltesting.R.drawable.ukr44;
import static com.diplom.nck.externaltesting.R.drawable.ukr45;
import static com.diplom.nck.externaltesting.R.drawable.ukr46;
import static com.diplom.nck.externaltesting.R.drawable.ukr47;
import static com.diplom.nck.externaltesting.R.drawable.ukr48;
import static com.diplom.nck.externaltesting.R.drawable.ukr49;
import static com.diplom.nck.externaltesting.R.drawable.ukr50;
import static com.diplom.nck.externaltesting.R.drawable.ukr51;
import static com.diplom.nck.externaltesting.R.drawable.ukr52;
import static com.diplom.nck.externaltesting.R.drawable.ukr53;
import static com.diplom.nck.externaltesting.R.drawable.ukr54;
import static com.diplom.nck.externaltesting.R.drawable.ukr55;
import static com.diplom.nck.externaltesting.R.drawable.ukr56;



public class Ukr16Activity extends AppCompatActivity {

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
    RadioButton answer21;
    RadioButton answer22;
    RadioButton answer23;

    RadioButton answer24x1;
    RadioButton answer24x2;
    RadioButton answer24x3;
    RadioButton answer24x4;

    RadioButton answer25x1;
    RadioButton answer25x2;
    RadioButton answer25x3;
    RadioButton answer25x4;

    RadioButton answer26x1;
    RadioButton answer26x2;
    RadioButton answer26x3;
    RadioButton answer26x4;

    RadioButton answer27x1;
    RadioButton answer27x2;
    RadioButton answer27x3;
    RadioButton answer27x4;

    RadioButton answer28x1;
    RadioButton answer28x2;
    RadioButton answer28x3;
    RadioButton answer28x4;

    RadioButton answer29;
    RadioButton answer30;
    RadioButton answer31;
    RadioButton answer32;
    RadioButton answer33;
    RadioButton answer34;
    RadioButton answer35;
    RadioButton answer36;
    RadioButton answer37;
    RadioButton answer38;
    RadioButton answer39;
    RadioButton answer40;
    RadioButton answer41;
    RadioButton answer42;
    RadioButton answer43;
    RadioButton answer44;
    RadioButton answer45;
    RadioButton answer46;
    RadioButton answer47;
    RadioButton answer48;
    RadioButton answer49;
    RadioButton answer50;
    RadioButton answer51;
    RadioButton answer52;
    RadioButton answer53;

    RadioButton answer54x1;
    RadioButton answer54x2;
    RadioButton answer54x3;
    RadioButton answer54x4;

    RadioButton answer55x1;
    RadioButton answer55x2;
    RadioButton answer55x3;
    RadioButton answer55x4;

    RadioButton answer56x1;
    RadioButton answer56x2;
    RadioButton answer56x3;
    RadioButton answer56x4;

    RadioButton answer57x1;
    RadioButton answer57x2;
    RadioButton answer57x3;
    RadioButton answer57x4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] ques16;
        ques16 = getResources().getStringArray(R.array.ques);

        LayoutInflater inflater = LayoutInflater.from(this);
        List<View> pages = new ArrayList<View>();

        View page = inflater.inflate(R.layout.ukr1_10, null);
        TextView question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[0]);
        ImageView img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr1);
        answer1 = (RadioButton)page.findViewById(R.id.button1);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr1_10, null);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[1]);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr2);
        answer2 = (RadioButton)page.findViewById(R.id.button3);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr1_10, null);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[2]);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr3);
        answer3 = (RadioButton)page.findViewById(R.id.button4);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr1_10, null);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[3]);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr4);
        answer4 = (RadioButton)page.findViewById(R.id.button1);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr1_10, null);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[4]);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr5);
        answer5 = (RadioButton)page.findViewById(R.id.button4);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr1_10, null);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[5]);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr6);
        answer6 = (RadioButton)page.findViewById(R.id.button2);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr1_10, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr7);
        question = (TextView) page.findViewById(R.id.question);
        question.setText("Питання №7");
        answer7 = (RadioButton)page.findViewById(R.id.button4);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr1_10, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr8);
        question = (TextView) page.findViewById(R.id.question);
        question.setText("Питання №8");
        answer8 = (RadioButton)page.findViewById(R.id.button3);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr1_10, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr9);
        question = (TextView) page.findViewById(R.id.question);
        question.setText("Питання №9");
        answer9 = (RadioButton)page.findViewById(R.id.button3);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr1_10, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr10);
        question = (TextView) page.findViewById(R.id.question);
        question.setText("Питання №10");
        answer10 = (RadioButton)page.findViewById(R.id.button2);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr11);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[6]);
        answer11 = (RadioButton)page.findViewById(R.id.button4);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr12);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[7]);
        answer12 = (RadioButton)page.findViewById(R.id.button3);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr13);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[8]);
        answer13 = (RadioButton)page.findViewById(R.id.button3);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr14);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[9]);
        answer14 = (RadioButton)page.findViewById(R.id.button1);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr15);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[10]);
        answer15 = (RadioButton)page.findViewById(R.id.button3);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr16);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[11]);
        answer16 = (RadioButton)page.findViewById(R.id.button3);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr17);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[12]);
        answer17 = (RadioButton)page.findViewById(R.id.button5);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr18);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[13]);
        answer18 = (RadioButton)page.findViewById(R.id.button2);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr19);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[14]);
        answer19 = (RadioButton)page.findViewById(R.id.button4);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr20);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[15]);
        answer20 = (RadioButton)page.findViewById(R.id.button5);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr21);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[16]);
        answer21 = (RadioButton)page.findViewById(R.id.button1);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr22);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[17]);
        answer22 = (RadioButton)page.findViewById(R.id.button4);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr23);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[18]);
        answer23 = (RadioButton)page.findViewById(R.id.button3);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr24_28, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr24);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[19]);
        answer24x1 = (RadioButton)page.findViewById(R.id.button14);
        answer24x2 = (RadioButton)page.findViewById(R.id.button25);
        answer24x3 = (RadioButton)page.findViewById(R.id.button33);
        answer24x4 = (RadioButton)page.findViewById(R.id.button41);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr24_28, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr25);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[20]);
        answer25x1 = (RadioButton)page.findViewById(R.id.button12);
        answer25x2 = (RadioButton)page.findViewById(R.id.button21);
        answer25x3 = (RadioButton)page.findViewById(R.id.button33);
        answer25x4 = (RadioButton)page.findViewById(R.id.button44);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr24_28, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr26);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[21]);
        answer26x1 = (RadioButton)page.findViewById(R.id.button15);
        answer26x2 = (RadioButton)page.findViewById(R.id.button24);
        answer26x3 = (RadioButton)page.findViewById(R.id.button33);
        answer26x4 = (RadioButton)page.findViewById(R.id.button42);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr24_28, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr27);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[22]);
        answer27x1 = (RadioButton)page.findViewById(R.id.button14);
        answer27x2 = (RadioButton)page.findViewById(R.id.button25);
        answer27x3 = (RadioButton)page.findViewById(R.id.button33);
        answer27x4 = (RadioButton)page.findViewById(R.id.button42);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr24_28, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr28);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[23]);
        answer28x1 = (RadioButton)page.findViewById(R.id.button12);
        answer28x2 = (RadioButton)page.findViewById(R.id.button24);
        answer28x3 = (RadioButton)page.findViewById(R.id.button31);
        answer28x4 = (RadioButton)page.findViewById(R.id.button43);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr29_33, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr29);
        answer29 = (RadioButton)page.findViewById(R.id.button3);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr29_33, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr30);
        answer30 = (RadioButton)page.findViewById(R.id.button4);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr29_33, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr31);
        answer31 = (RadioButton)page.findViewById(R.id.button3);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr29_33, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr32);
        answer32 = (RadioButton)page.findViewById(R.id.button2);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr29_33, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr33);
        answer33 = (RadioButton)page.findViewById(R.id.button3);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr34);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[24]);
        answer34 = (RadioButton)page.findViewById(R.id.button1);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr35);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[25]);
        answer35 = (RadioButton)page.findViewById(R.id.button4);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr36);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[26]);
        answer36 = (RadioButton)page.findViewById(R.id.button2);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr37);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[27]);
        answer37 = (RadioButton)page.findViewById(R.id.button2);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr38);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[28]);
        answer38 = (RadioButton)page.findViewById(R.id.button3);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr39);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[29]);
        answer39 = (RadioButton)page.findViewById(R.id.button5);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr40);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[30]);
        answer40 = (RadioButton)page.findViewById(R.id.button1);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr41);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[31]);
        answer41 = (RadioButton)page.findViewById(R.id.button3);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr42);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[32]);
        answer42 = (RadioButton)page.findViewById(R.id.button2);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr43);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[33]);
        answer43 = (RadioButton)page.findViewById(R.id.button1);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr44);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[34]);
        answer44 = (RadioButton)page.findViewById(R.id.button3);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr45);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[35]);
        answer45 = (RadioButton)page.findViewById(R.id.button4);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr46);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[36]);
        answer46 = (RadioButton)page.findViewById(R.id.button2);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr47);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[37]);
        answer47 = (RadioButton)page.findViewById(R.id.button5);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr48);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[38]);
        answer48 = (RadioButton)page.findViewById(R.id.button4);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr49);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[39]);
        answer49 = (RadioButton)page.findViewById(R.id.button2);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr50);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[40]);
        answer50 = (RadioButton)page.findViewById(R.id.button1);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr51);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[41]);
        answer51 = (RadioButton)page.findViewById(R.id.button3);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr52);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[42]);
        answer52 = (RadioButton)page.findViewById(R.id.button4);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr11_23, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr53);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[43]);
        answer53 = (RadioButton)page.findViewById(R.id.button2);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr24_28, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr54);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[44]);
        answer54x1 = (RadioButton)page.findViewById(R.id.button15);
        answer54x2 = (RadioButton)page.findViewById(R.id.button24);
        answer54x3 = (RadioButton)page.findViewById(R.id.button31);
        answer54x4 = (RadioButton)page.findViewById(R.id.button42);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr24_28, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr55);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[45]);
        answer55x1 = (RadioButton)page.findViewById(R.id.button11);
        answer55x2 = (RadioButton)page.findViewById(R.id.button25);
        answer55x3 = (RadioButton)page.findViewById(R.id.button34);
        answer55x4 = (RadioButton)page.findViewById(R.id.button43);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr24_28, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr56);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[46]);
        answer56x1 = (RadioButton)page.findViewById(R.id.button14);
        answer56x2 = (RadioButton)page.findViewById(R.id.button23);
        answer56x3 = (RadioButton)page.findViewById(R.id.button31);
        answer56x4 = (RadioButton)page.findViewById(R.id.button42);
        pages.add(page);

        page = inflater.inflate(R.layout.ukr24_28, null);
        img = (ImageView) page.findViewById(R.id.a);
        img.setImageResource(ukr57);
        question = (TextView) page.findViewById(R.id.question);
        question.setText(ques16[47]);
        answer57x1 = (RadioButton)page.findViewById(R.id.button13);
        answer57x2 = (RadioButton)page.findViewById(R.id.button22);
        answer57x3 = (RadioButton)page.findViewById(R.id.button34);
        answer57x4 = (RadioButton)page.findViewById(R.id.button45);
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
        if (answer21.isChecked()) {
            points++;
        }
        if (answer22.isChecked()) {
            points++;
        }
        if (answer23.isChecked()) {
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
        if (answer25x1.isChecked()) {
            points++;
        }
        if (answer25x2.isChecked()) {
            points++;
        }
        if (answer25x3.isChecked()) {
            points++;
        }
        if (answer25x4.isChecked()) {
            points++;
        }
        if (answer26x1.isChecked()) {
            points++;
        }
        if (answer26x2.isChecked()) {
            points++;
        }
        if (answer26x3.isChecked()) {
            points++;
        }
        if (answer26x4.isChecked()) {
            points++;
        }
        if (answer27x1.isChecked()) {
            points++;
        }
        if (answer27x2.isChecked()) {
            points++;
        }
        if (answer27x3.isChecked()) {
            points++;
        }
        if (answer27x4.isChecked()) {
            points++;
        }
        if (answer28x1.isChecked()) {
            points++;
        }
        if (answer28x2.isChecked()) {
            points++;
        }
        if (answer28x3.isChecked()) {
            points++;
        }
        if (answer28x4.isChecked()) {
            points++;
        }
        if (answer29.isChecked()) {
            points++;
        }
        if (answer30.isChecked()) {
            points++;
        }
        if (answer31.isChecked()) {
            points++;
        }
        if (answer32.isChecked()) {
            points++;
        }
        if (answer33.isChecked()) {
            points++;
        }
        if (answer34.isChecked()) {
            points++;
        }
        if (answer35.isChecked()) {
            points++;
        }
        if (answer36.isChecked()) {
            points++;
        }
        if (answer37.isChecked()) {
            points++;
        }
        if (answer38.isChecked()) {
            points++;
        }
        if (answer39.isChecked()) {
            points++;
        }
        if (answer40.isChecked()) {
            points++;
        }
        if (answer41.isChecked()) {
            points++;
        }
        if (answer42.isChecked()) {
            points++;
        }
        if (answer43.isChecked()) {
            points++;
        }
        if (answer44.isChecked()) {
            points++;
        }
        if (answer45.isChecked()) {
            points++;
        }
        if (answer46.isChecked()) {
            points++;
        }
        if (answer47.isChecked()) {
            points++;
        }
        if (answer48.isChecked()) {
            points++;
        }
        if (answer49.isChecked()) {
            points++;
        }
        if (answer50.isChecked()) {
            points++;
        }
        if (answer51.isChecked()) {
            points++;
        }
        if (answer52.isChecked()) {
            points++;
        }
        if (answer53.isChecked()) {
            points++;
        }
        if (answer54x1.isChecked()) {
            points++;
        }
        if (answer54x2.isChecked()) {
            points++;
        }
        if (answer54x3.isChecked()) {
            points++;
        }
        if (answer54x4.isChecked()) {
            points++;
        }
        if (answer55x1.isChecked()) {
            points++;
        }
        if (answer55x2.isChecked()) {
            points++;
        }
        if (answer55x3.isChecked()) {
            points++;
        }
        if (answer55x4.isChecked()) {
            points++;
        }
        if (answer56x1.isChecked()) {
            points++;
        }
        if (answer56x2.isChecked()) {
            points++;
        }
        if (answer56x3.isChecked()) {
            points++;
        }
        if (answer56x4.isChecked()) {
            points++;
        }
        if (answer57x1.isChecked()) {
            points++;
        }
        if (answer57x2.isChecked()) {
            points++;
        }
        if (answer57x3.isChecked()) {
            points++;
        }
        if (answer57x4.isChecked()) {
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
