package com.e.indwork;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.InputFilter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;


public class MainActivity extends AppCompatActivity  {
String[] levels;
String[] checks;
double[] o=new double[10];
double[] oh=new double[10];
double[] oe=new double[7];
double[] u=new double[10];
double[] uh=new double[10];
double[] ue=new double[7];
double[] w=new double[10];
double[] wh=new double[10];
double[] we=new double[7];
Spinner check;
TextView textView;
double rs;
double rh;
double re;
double [] usr;
double[] uhr;
double[] uer;
double[]sed=new double[3];


    @SuppressLint({"CutPasteId", "DefaultLocale"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button beginCalculation= findViewById(R.id.button);
        Button step23=findViewById(R.id.button3);
        Button step45=findViewById(R.id.button4);
        ScrollView scrollView=findViewById(R.id.scroll);
        EditText ks=findViewById(R.id.uss);
        EditText kh=findViewById(R.id.ush);
        EditText ke=findViewById(R.id.use);
        usr=new double[3];
        uhr=new double[3];
        uer=new double[3];
        scrollView.setFocusable(false);
        levels = new String[]{ "низький рівень", "рівень нижче середнього", "середній рівень", "рівень вище середнього", "високий рівень" };
        checks = new String[]{ "песимістичний сценарій розгортання подій", "обережний сценарій розгортання подій", "середній сценарій розгортання подій", "оптимістичний сценарій розгортання подій" };
        check =  findViewById(R.id.check);
        Spinner spin1 =  findViewById(R.id.ss);
        Spinner spin2 =  findViewById(R.id.ss1);
        Spinner spin3 =  findViewById(R.id.ss2);
        Spinner spin4 =  findViewById(R.id.ss3);
        Spinner spin5 =  findViewById(R.id.ss4);
        Spinner spin6 =  findViewById(R.id.ss5);
        Spinner spin7 =  findViewById(R.id.ss6);
        Spinner spin8 =  findViewById(R.id.ss7);
        Spinner spin9 =  findViewById(R.id.ss8);
        Spinner spin10 = findViewById(R.id.ss9);
        Spinner sHpin1 =  findViewById(R.id.sh);
        Spinner sHpin2 =  findViewById(R.id.sh1);
        Spinner sHpin3 =  findViewById(R.id.sh2);
        Spinner sHpin4 =  findViewById(R.id.sh3);
        Spinner sHpin5 =  findViewById(R.id.sh4);
        Spinner sHpin6 =  findViewById(R.id.sh5);
        Spinner sHpin7 =  findViewById(R.id.sh6);
        Spinner sHpin8 =  findViewById(R.id.sh7);
        Spinner sHpin9 =  findViewById(R.id.sh8);
        Spinner sHpin10 = findViewById(R.id.sh9);
        Spinner sEpin1 =  findViewById(R.id.she);
        Spinner sEpin2 =  findViewById(R.id.she1);
        Spinner sEpin3 =  findViewById(R.id.she2);
        Spinner sEpin4 =  findViewById(R.id.she3);
        Spinner sEpin5 =  findViewById(R.id.she4);
        Spinner sEpin6 =  findViewById(R.id.she5);
        Spinner sEpin7 =  findViewById(R.id.she6);
        EditText ss1 = findViewById(R.id.editText1);
        EditText ss2 = findViewById(R.id.editText2);
        EditText ss3 = findViewById(R.id.editText3);
        EditText ss4 = findViewById(R.id.editText4);
        EditText ss5 = findViewById(R.id.editText5);
        EditText ss6 = findViewById(R.id.editText6);
        EditText ss7 = findViewById(R.id.editText7);
        EditText ss8 = findViewById(R.id.editText8);
        EditText ss9 = findViewById(R.id.editText9);
        EditText ss10 = findViewById(R.id.editText10);
        EditText sh1 = findViewById(R.id.editTexth1);
        EditText sh2 = findViewById(R.id.editTexth2);
        EditText sh3 = findViewById(R.id.editTexth3);
        EditText sh4 = findViewById(R.id.editTexth4);
        EditText sh5 = findViewById(R.id.editTexth5);
        EditText sh6 = findViewById(R.id.editTexth6);
        EditText sh7 = findViewById(R.id.editTexth7);
        EditText sh8 = findViewById(R.id.editTexth8);
        EditText sh9 = findViewById(R.id.editTexth9);
        EditText sh10 = findViewById(R.id.editTexth10);
        EditText se1 = findViewById(R.id.editTexthe1);
        EditText se2 = findViewById(R.id.editTexthe2);
        EditText se3 = findViewById(R.id.editTexthe3);
        EditText se4 = findViewById(R.id.editTexthe4);
        EditText se5 = findViewById(R.id.editTexthe5);
        EditText se6 = findViewById(R.id.editTexthe6);
        EditText se7 = findViewById(R.id.editTexthe7);
        EditText a1 =findViewById(R.id.editText11);
        EditText a2 =findViewById(R.id.editText12);
        EditText a3 =findViewById(R.id.editText13);
        EditText a4 =findViewById(R.id.editText14);
        EditText a5 =findViewById(R.id.editText15);
        EditText a6 =findViewById(R.id.editText16);
        ks.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "10")});
        kh.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "10")});
        ke.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "10")});
        EditText editText= findViewById(R.id.v1);
        int vmain=editText.getId();
        for (int i=vmain;i<vmain+10;i++) {
            editText = findViewById(i);
            editText.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "10")});
        }
        editText= findViewById(R.id.vh1);
        vmain=editText.getId();
        for (int i=vmain;i<vmain+10;i++) {
            editText = findViewById(i);
            editText.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "10")});
        }
        editText= findViewById(R.id.ve1);
        vmain=editText.getId();
        for (int i=vmain;i<vmain+7;i++) {
            editText = findViewById(i);
            editText.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "10")});
        }
        editText= findViewById(R.id.editText1);
        vmain=editText.getId();
        for (int i=vmain;i<vmain+10;i++) {
            editText = findViewById(i);
            editText.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "1")});
        }
        editText= findViewById(R.id.editTexth1);
        vmain=editText.getId();
        for (int i=vmain;i<vmain+10;i++) {
            editText = findViewById(i);
            editText.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "1")});
        }
        editText= findViewById(R.id.editTexthe1);
        vmain=editText.getId();
        for (int i=vmain;i<vmain+7;i++) {
            editText = findViewById(i);
            editText.setFilters(new InputFilter[]{ new InputFilterMinMax("0", "1")});
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, levels);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter<String> chadapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, checks);
        chadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        check.setAdapter(chadapter);
        spin1.setAdapter(adapter);
        spin2.setAdapter(adapter);
        spin3.setAdapter(adapter);
        spin4.setAdapter(adapter);
        spin5.setAdapter(adapter);
        spin6.setAdapter(adapter);
        spin7.setAdapter(adapter);
        spin8.setAdapter(adapter);
        spin9.setAdapter(adapter);
        spin10.setAdapter(adapter);
        sHpin1.setAdapter(adapter);
        sHpin2.setAdapter(adapter);
        sHpin3.setAdapter(adapter);
        sHpin4.setAdapter(adapter);
        sHpin5.setAdapter(adapter);
        sHpin6.setAdapter(adapter);
        sHpin7.setAdapter(adapter);
        sHpin8.setAdapter(adapter);
        sHpin9.setAdapter(adapter);
        sHpin10.setAdapter(adapter);
        sEpin1.setAdapter(adapter);
        sEpin2.setAdapter(adapter);
        sEpin3.setAdapter(adapter);
        sEpin4.setAdapter(adapter);
        sEpin5.setAdapter(adapter);
        sEpin6.setAdapter(adapter);
        sEpin7.setAdapter(adapter);

        beginCalculation.setOnClickListener(v->{
            try {
                double[] ss = new double[]{Double.parseDouble(ss1.getText().toString()), Double.parseDouble(ss2.getText().toString()), Double.parseDouble(ss3.getText().toString()),
                        Double.parseDouble(ss4.getText().toString()), Double.parseDouble(ss5.getText().toString()),Double.parseDouble( ss6.getText().toString()), Double.parseDouble(ss7.getText().toString()),
                        Double.parseDouble(ss8.getText().toString()), Double.parseDouble(ss9.getText().toString()), Double.parseDouble(ss10.getText().toString())};
                double[] sh = new double[]{Double.parseDouble(sh1.getText().toString()),Double.parseDouble( sh2.getText().toString()), Double.parseDouble(sh3.getText().toString()),
                        Double.parseDouble(sh4.getText().toString()), Double.parseDouble(sh5.getText().toString()),Double.parseDouble( sh6.getText().toString()), Double.parseDouble(sh7.getText().toString()),
                        Double.parseDouble(sh8.getText().toString()), Double.parseDouble(sh9.getText().toString()), Double.parseDouble(sh10.getText().toString()),};
                double[] se = new double[]{Double.parseDouble(se1.getText().toString()), Double.parseDouble(se2.getText().toString()), Double.parseDouble(se3.getText().toString()),
                        Double.parseDouble(se4.getText().toString()), Double.parseDouble(se5.getText().toString()),Double.parseDouble( se6.getText().toString()), Double.parseDouble(se7.getText().toString())};
                double[] a= new double[]{Double.parseDouble(a1.getText().toString()), Double.parseDouble(a2.getText().toString()), Double.parseDouble(a3.getText().toString()), Double.parseDouble(a4.getText().toString()),
                        Double.parseDouble(a5.getText().toString()), Double.parseDouble(a6.getText().toString())};
                String[] lvlss= new String[]{spin1.getSelectedItem().toString(),spin2.getSelectedItem().toString(),spin3.getSelectedItem().toString(),
                        spin4.getSelectedItem().toString(),spin5.getSelectedItem().toString(),spin6.getSelectedItem().toString(),
                        spin7.getSelectedItem().toString(),spin8.getSelectedItem().toString(),spin9.getSelectedItem().toString(),spin10.getSelectedItem().toString()};
                String[] lvlsh= new String[]{sHpin1.getSelectedItem().toString(),sHpin2.getSelectedItem().toString(),sHpin3.getSelectedItem().toString(),
                        sHpin4.getSelectedItem().toString(),sHpin5.getSelectedItem().toString(),sHpin6.getSelectedItem().toString(),
                        sHpin7.getSelectedItem().toString(),sHpin8.getSelectedItem().toString(),sHpin9.getSelectedItem().toString(),sHpin10.getSelectedItem().toString()};
                String[] lvlse= new String[]{sEpin1.getSelectedItem().toString(),sEpin2.getSelectedItem().toString(),sEpin3.getSelectedItem().toString(),
                        sEpin4.getSelectedItem().toString(),sEpin5.getSelectedItem().toString(),sEpin6.getSelectedItem().toString(),
                        spin7.getSelectedItem().toString()};
                stepOne(ss,sh,se,a,lvlss,lvlsh,lvlse);
            }
            catch (NullPointerException e){
                Toast.makeText(this,"Введіть всі значення таблиці",Toast.LENGTH_LONG).show();
                e.printStackTrace();
            }
            catch (Exception e){
                Toast.makeText(this,"Сталася помилка",Toast.LENGTH_LONG).show();
                e.printStackTrace();
            }

        });
        step23.setOnClickListener(view ->{
            try {
                EditText edy= findViewById(R.id.v1);
                int vs=edy.getId();
                int vvs = 0;
                int [] vsmain = new int[10];
                for (int i=vs;i<vs+10;i++) {
                    if (i-vs==0){
                        edy=findViewById(i);
                        vsmain[i-vs]=Integer.valueOf(edy.getText().toString());
                        vvs=vsmain[i-vs];
                        continue;
                    }
                    if (i-vs==1){
                        edy=findViewById(i);
                        vsmain[9]=Integer.valueOf(edy.getText().toString());
                        vvs=vvs+vsmain[9];
                        i++;
                    }
                    edy=findViewById(i);
                    vsmain[i-vs-1]=Integer.valueOf(edy.getText().toString());
                    vvs=vvs+vsmain[i-vs-1];
                }
                edy= findViewById(R.id.vh1);
                vs=edy.getId();
                int vvh = 0;
                int [] vhmain = new int[10];
                for (int i=vs;i<vs+10;i++) {
                    if (i-vs==0){
                        edy=findViewById(i);
                        vhmain[i-vs]=Integer.valueOf(edy.getText().toString());
                        vvh=vhmain[i-vs];
                        continue;
                    }
                    if (i-vs==1){
                        edy=findViewById(i);
                        vhmain[9]=Integer.valueOf(edy.getText().toString());
                        vvh=vvh+vhmain[9];
                        i++;
                    }
                    edy=findViewById(i);
                    vhmain[i-vs-1]=Integer.valueOf(edy.getText().toString());
                    vvh=vvh+vhmain[i-vs-1];
                }
                edy= findViewById(R.id.ve1);
                vs=edy.getId();
                int vve = 0;
                int [] vemain = new int[7];
                for (int i=vs;i<vs+7;i++) {
                    edy=findViewById(i);
                    vemain[i-vs]=Integer.valueOf(edy.getText().toString());
                    vve=vve+vemain[i-vs];
                }
                stepTwoThree(vsmain,vvs,o,u,vhmain,vvh,oh,uh,vemain,vve,oe,ue);

            }
            catch (NullPointerException e){
            Toast.makeText(this,"Введіть всі значення таблиці, або завершіть попередній крок",Toast.LENGTH_LONG).show();
            e.printStackTrace();
            }
            catch (Exception e){
                    Toast.makeText(this,"Сталася помилка",Toast.LENGTH_LONG).show();
                    e.printStackTrace();
            }
        });
        step45.setOnClickListener(view ->{
            try {
                textView=findViewById(R.id.ssu);
                textView.setText(String.format("%.3f",stepFour(rs,(double) 5/3)));
                textView=findViewById(R.id.shu);
                textView.setText(String.format("%.3f",stepFour(rh,(double) 5/3)));
                textView=findViewById(R.id.seu);
                textView.setText(String.format("%.3f",stepFour(re,(double) 5/3)));
                textView=findViewById(R.id.esu);
                textView.setText(String.format("%.3f",stepFour(rs,(double) 4/3)));
                textView=findViewById(R.id.ehu);
                textView.setText(String.format("%.3f",stepFour(rh,(double) 4/3)));
                textView=findViewById(R.id.eeu);
                textView.setText(String.format("%.3f",stepFour(re,(double) 4/3)));
                textView=findViewById(R.id.dsu);
                textView.setText(String.format("%.3f",stepFour(rs,(double) 2/3)));
                textView=findViewById(R.id.dhu);
                textView.setText(String.format("%.3f",stepFour(rh,(double) 2/3)));
                textView=findViewById(R.id.deu);
                textView.setText(String.format("%.3f",stepFour(re,(double) 2/3)));
                for (int i=0;i<3;i++){
                    usr[i]=stepFour(rs,(double)5/3);
                }
                for (int i=0;i<3;i++){
                    uhr[i]=stepFour(rh,(double)4/3);
                }
                for (int i=0;i<3;i++){
                    uer[i]=stepFour(re,(double)2/3);
                }
                double koefs = Double.valueOf(ks.getText().toString()) / (Double.valueOf(ks.getText().toString()) + Double.valueOf(kh.getText().toString()) + Double.valueOf(ke.getText().toString()));
                double koefh = Double.valueOf(ks.getText().toString()) / (Double.valueOf(ks.getText().toString()) + Double.valueOf(kh.getText().toString()) + Double.valueOf(ke.getText().toString()));
                double koefe = Double.valueOf(ks.getText().toString()) / (Double.valueOf(ks.getText().toString()) + Double.valueOf(kh.getText().toString()) + Double.valueOf(ke.getText().toString()));
                double [] koefss=new double[]{Double.valueOf(String.format(Locale.ROOT,"%.2f",koefs)),Double.valueOf(String.format(Locale.ROOT,"%.2f",koefh)),Double.valueOf(String.format(Locale.ROOT,"%.2f",koefe))};
                sed=new double[]{0,0,0};
                for (int i=0;i<3;i++){
                    double [] temp = new double[3];
                    if(i==0){ temp=usr;}
                    if(i==1){ temp=uhr;}
                    if(i==2){ temp=uer;}
                    for (int j=0;j<3;j++)
                     {
                        sed[i]=sed[i]+(koefss[j]*temp[j]);
                     }
                }
            }
            catch (NullPointerException e){
                Toast.makeText(this,"Введіть всі значення таблиці, або завершіть попередній крок",Toast.LENGTH_LONG).show();
                e.printStackTrace();
            }
            catch (Exception e){
                Toast.makeText(this,"Сталася помилка",Toast.LENGTH_LONG).show();
                e.printStackTrace();
            }
        });

    }
    @SuppressLint("DefaultLocale")
    private void stepOne(double[]ss, double [] sh, double se[], double[]a, String[] lvlss, String[]lvlsh, String[]lvlse){
        for (int i=0;i<=9;i++){
            if(lvlss[i].equals(levels[0])){
                o[i]=a[1]*ss[i];
                if(o[i]<=a[0]){
                    u[i]=0;
                    continue;}
                if(o[i]>a[0]&&o[i]<((a[0]+a[5])/2)){
                    u[i]=Math.pow((o[i]-a[0])/(a[5]-a[0]),2)*2;
                    continue;
                }
                if (o[i]>((a[0]+a[5]))/2&&o[i]<a[5]){
                   u[i]=1-(Math.pow((a[5]-o[i])/(a[5]-a[0]),2)*2);
                    continue;
                }
                if (o[i]>=a[5]){
                    u[i]=1;
                    continue;
                }
            }
            if(lvlss[i].equals(levels[1])){
                o[i]=a[2]*ss[i];
                if(o[i]<=a[0]){
                    u[i]=0;
                    continue;}
                if(o[i]>a[0]&&o[i]<((a[0]+a[5])/2)){
                    u[i]=Math.pow((o[i]-a[0])/(a[5]-a[0]),2)*2;
                    continue;
                }
                if (o[i]>((a[0]+a[5])/2)&&o[i]<a[5]){
                    u[i]=1-(Math.pow((a[5]-o[i])/(a[5]-a[0]),2)*2);
                    continue;
                }
                if (o[i]>=a[5]){
                    u[i]=1;
                    continue;
                }
            }
            if(lvlss[i].equals(levels[2])){
                o[i]=a[3]*ss[i];
                if(o[i]<=a[0]){
                    u[i]=0;
                    continue;}
                if(o[i]>a[0]&&o[i]<(a[0]+a[5])/2){
                    u[i]=Math.pow((o[i]-a[0])/(a[5]-a[0]),2)*2;
                    continue;
                }
                if (o[i]>((a[0]+a[5]))/2&&o[i]<a[5]){
                    u[i]=1-(Math.pow((a[5]-o[i])/(a[5]-a[0]),2)*2);
                    continue;
                }
                if (o[i]>=a[5]){
                    u[i]=1;
                    continue;
                }
            }
            if(lvlss[i].equals(levels[3])){
                o[i]=a[4]*ss[i];
                if(o[i]<=a[0]){
                    u[i]=0;
                    continue;}
                if(o[i]>a[0]&&o[i]<(a[0]+a[5])/2){
                    u[i]=Math.pow((o[i]-a[0])/(a[5]-a[0]),2)*2;
                    continue;
                }
                if (o[i]>(a[0]+a[5])/2&&o[i]<a[5]){
                    u[i]=1-(Math.pow((a[5]-o[i])/(a[5]-a[0]),2)*2);
                    continue;
                }
                if (o[i]>=a[5]){
                    u[i]=1;
                    continue;
                }
            }
            if(lvlss[i].equals(levels[4])){
                o[i]=a[5]*ss[i];
                if(o[i]<=a[0]){
                    u[i]=0;
                    continue;}
                if(o[i]>a[0]&&o[i]<(a[0]+a[5])/2){
                    u[i]=Math.pow((o[i]-a[0])/(a[5]-a[0]),2)*2;
                    continue;
                }
                if (o[i]>(a[0]+a[5])/2&&o[i]<a[5]){
                    u[i]=1-(Math.pow((a[5]-o[i])/(a[5]-a[0]),2)*2);
                    continue;
                }
                if (o[i]>=a[5]){
                    u[i]=1;

                }
            }
        }
        for (int i=0;i<=9;i++){
            if(lvlsh[i].equals(levels[0])){
                oh[i]=a[1]*sh[i];
                if(oh[i]<=a[0]){
                    uh[i]=0;
                    continue;}
                if(oh[i]>a[0]&&oh[i]<(a[0]+a[5])/2){
                    uh[i]=Math.pow((oh[i]-a[0])/(a[5]-a[0]),2)*2;
                    continue;
                }
                if (oh[i]>(a[0]+a[5])/2&&oh[i]<a[5]){
                    uh[i]=1-(Math.pow((a[5]-oh[i])/(a[5]-a[0]),2)*2);
                    continue;
                }
                if (oh[i]>=a[5]){
                    uh[i]=1;
                    continue;
                }
            }
            if(lvlsh[i].equals(levels[1])){
                oh[i]=a[2]*sh[i];
                if(oh[i]<=a[0]){
                    uh[i]=0;
                    continue;}
                if(oh[i]>a[0]&&oh[i]<(a[0]+a[5])/2){
                    uh[i]=Math.pow((oh[i]-a[0])/(a[5]-a[0]),2)*2;
                    continue;
                }
                if (oh[i]>(a[0]+a[5])/2&&oh[i]<a[5]){
                    uh[i]=1-(Math.pow((a[5]-oh[i])/(a[5]-a[0]),2)*2);
                    continue;
                }
                if (oh[i]>=a[5]){
                    uh[i]=1;
                    continue;
                }
            }
            if(lvlsh[i].equals(levels[2])){
                oh[i]=a[3]*sh[i];
                if(oh[i]<=a[0]){
                    uh[i]=0;
                    continue;}
                if(oh[i]>a[0]&&oh[i]<(a[0]+a[5])/2){
                    uh[i]=Math.pow((oh[i]-a[0])/(a[5]-a[0]),2)*2;
                    continue;
                }
                if (oh[i]>(a[0]+a[5])/2&&oh[i]<a[5]){
                    uh[i]=1-(Math.pow((a[5]-oh[i])/(a[5]-a[0]),2)*2);
                    continue;
                }
                if (oh[i]>=a[5]){
                    uh[i]=1;
                    continue;
                }
            }
            if(lvlsh[i].equals(levels[3])){
                oh[i]=a[4]*sh[i];
                if(oh[i]<=a[0]){
                    uh[i]=0;
                    continue;}
                if(oh[i]>a[0]&&oh[i]<(a[0]+a[5])/2){
                    uh[i]=Math.pow((oh[i]-a[0])/(a[5]-a[0]),2)*2;
                    continue;
                }
                if (oh[i]>(a[0]+a[5])/2&&oh[i]<a[5]){
                    uh[i]=1-(Math.pow((a[5]-oh[i])/(a[5]-a[0]),2)*2);
                    continue;
                }
                if (oh[i]>=a[5]){
                    uh[i]=1;
                    continue;
                }
            }
            if(lvlsh[i].equals(levels[4])){
                oh[i]=a[5]*sh[i];
                if(oh[i]<=a[0]){
                    uh[i]=0;
                    continue;}
                if(oh[i]>a[0]&&oh[i]<(a[0]+a[5])/2){
                    uh[i]=Math.pow((oh[i]-a[0])/(a[5]-a[0]),2)*2;
                    continue;
                }
                if (oh[i]>(a[0]+a[5])/2&&oh[i]<a[5]){
                    uh[i]=1-(Math.pow((a[5]-oh[i])/(a[5]-a[0]),2)*2);
                    continue;
                }
                if (oh[i]>=a[5]){
                    uh[i]=1;
                }
            }
        }
        for (int i=0;i<=6;i++){
            if(lvlse[i].equals(levels[0])){
                oe[i]=a[1]*se[i];
                if(oe[i]<=a[0]){
                    ue[i]=0;
                    continue;}
                if(oe[i]>a[0]&&oe[i]<(a[0]+a[5])/2){
                    ue[i]=Math.pow((oe[i]-a[0])/(a[5]-a[0]),2)*2;
                    continue;
                }
                if (oe[i]>(a[0]+a[5])/2&&oe[i]<a[5]){
                    ue[i]=1-(Math.pow((a[5]-oe[i])/(a[5]-a[0]),2)*2);
                    continue;
                }
                if (oe[i]>=a[5]){
                    ue[i]=1;
                    continue;
                }
            }
            if(lvlse[i].equals(levels[1])){
                oe[i]=a[2]*se[i];
                if(oe[i]<=a[0]){
                    ue[i]=0;
                    continue;}
                if(oe[i]>a[0]&&oe[i]<(a[0]+a[5])/2){
                    ue[i]=Math.pow((oe[i]-a[0])/(a[5]-a[0]),2)*2;
                    continue;
                }
                if (oe[i]>(a[0]+a[5])/2&&oe[i]<a[5]){
                    ue[i]=1-(Math.pow((a[5]-oe[i])/(a[5]-a[0]),2)*2);
                    continue;
                }
                if (oe[i]>=a[5]){
                    ue[i]=1;
                    continue;
                }
            }
            if(lvlse[i].equals(levels[2])){
                oe[i]=a[3]*se[i];
                if(oe[i]<=a[0]){
                    ue[i]=0;
                    continue;}
                if(oe[i]>a[0]&&oe[i]<(a[0]+a[5])/2){
                    ue[i]=Math.pow((oe[i]-a[0])/(a[5]-a[0]),2)*2;
                    continue;
                }
                if (oe[i]>(a[0]+a[5])/2&&oe[i]<a[5]){
                    ue[i]=1-(Math.pow((a[5]-oe[i])/(a[5]-a[0]),2)*2);
                    continue;
                }
                if (oe[i]>=a[5]){
                    ue[i]=1;
                    continue;
                }
            }
            if(lvlse[i].equals(levels[3])){
                oe[i]=a[4]*se[i];
                if(oe[i]<=a[0]){
                    ue[i]=0;
                    continue;}
                if(oe[i]>a[0]&&oe[i]<(a[0]+a[5])/2){
                    ue[i]=Math.pow((oe[i]-a[0])/(a[5]-a[0]),2)*2;
                    continue;
                }
                if (oe[i]>(a[0]+a[5])/2&&oe[i]<a[5]){
                    ue[i]=1-(Math.pow((a[5]-oe[i])/(a[5]-a[0]),2)*2);
                    continue;
                }
                if (oe[i]>=a[5]){
                    ue[i]=1;
                    continue;
                }
            }
            if(lvlse[i].equals(levels[4])){
                oe[i]=a[5]*se[i];
                if(oe[i]<=a[0]){
                    ue[i]=0;
                    continue;}
                if(oe[i]>a[0]&&oe[i]<(a[0]+a[5])/2){
                    ue[i]=Math.pow((oe[i]-a[0])/(a[5]-a[0]),2)*2;
                    continue;
                }
                if (oe[i]>(a[0]+a[5])/2&&oe[i]<a[5]){
                    ue[i]=1-(Math.pow((a[5]-oe[i])/(a[5]-a[0]),2)*2);
                    continue;
                }
                if (oe[i]>=a[5]){
                    ue[i]=1;
                    continue;
                }
            }
        }
        textView=findViewById(R.id.o1);
        int text = textView.getId();
        for (int i=text;i<text+10;i++) {
            if (i-text==0){
                textView = findViewById(i);
                textView.setText(String.format("%.2f", o[i - text]));
                continue;
            }
            if (i-text==1){
                textView=findViewById(i);
                textView.setText(String.format("%.2f",o[9]));
                i++;
            }
            textView = findViewById(i);
            textView.setText(String.format("%.2f",o[i - text-1]));

        }
        textView=findViewById(R.id.oh1);
        int texth = textView.getId();
        for (int i=texth;i<texth+10;i++) {
            if (i-texth==0){
                textView = findViewById(i);
                textView.setText(String.format("%.2f", oh[i - texth]));
                continue;
            }
            if (i-texth==1){
                textView=findViewById(i);
                textView.setText(String.format("%.2f",oh[9]));
                i++;
            }
            textView = findViewById(i);
            textView.setText(String.format("%.2f",oh[i - texth-1]));

        }
        textView=findViewById(R.id.oe1);
        int texte = textView.getId();
        for (int i=texte;i<texte+7;i++) {

            textView = findViewById(i);
            textView.setText(String.format("%.2f",oe[i - texte]));

        }
        textView=findViewById(R.id.u1);
            int textu = textView.getId();
            for (int i=textu;i<textu+10;i++) {
            if (i-textu==0){
                textView = findViewById(i);
                textView.setText(String.format("%.4f", u[i - textu]));
                continue;
            }
            if (i-textu==1){
                textView=findViewById(i);
                textView.setText(String.format("%.4f",u[9]));
                i++;
            }
            textView = findViewById(i);
            textView.setText(String.format("%.4f",u[i - textu-1]));

        }
        textView=findViewById(R.id.uh1);
        int textuh = textView.getId();
        for (int i=textuh;i<textuh+10;i++) {
            if (i-textuh==0){
                textView = findViewById(i);
                textView.setText(String.format("%.4f", uh[i - textuh]));
                continue;
            }
            if (i-textuh==1){
                textView=findViewById(i);
                textView.setText(String.format("%.4f",uh[9]));
                i++;
            }
            textView = findViewById(i);
            textView.setText(String.format("%.4f",uh[i - textuh-1]));

        }
        textView=findViewById(R.id.ue1);
        int textue = textView.getId();
        for (int i=textue;i<textue+7;i++) {

            textView = findViewById(i);
            textView.setText(String.format("%.4f",ue[i - textue]));

        }
    }
    @SuppressLint("DefaultLocale")
    private void stepTwoThree(int[]vs, int vvs, double[]os, double[]us, int[]vh, int vvh, double[]oh, double[]uh, int[]ve, int vve, double[]oe, double[]ue){
        textView=findViewById(R.id.w1);
        int text = textView.getId();
        for (int i=text;i<text+10;i++) {
            if (i-text==0){
                textView = findViewById(i);
                w[i-text]=(double)vs[i-text]/vvs;
                textView.setText(String.format("%.3f",w[i-text]));
                continue;
            }
            if (i-text==1){
                textView = findViewById(i);
                w[9]=(double)vs[9] / vvs;
                textView.setText(String.format("%.3f",w[9]));
                i++;
            }
            textView = findViewById(i);
            w[i-text-1]=(double)vs[i-text-1] / vvs;
            textView.setText(String.format("%.3f",w[i-text-1]));

        }
        textView=findViewById(R.id.wh1);
        text = textView.getId();
        for (int i=text;i<text+10;i++) {
            if (i-text==0){
                textView = findViewById(i);
                wh[i-text]=(double)vh[i-text]/vvh;
                textView.setText(String.format("%.3f",wh[i-text]));
                continue;
            }
            if (i-text==1){
                textView = findViewById(i);
                wh[9]=(double)vh[9] / vvh;
                textView.setText(String.format("%.3f",wh[9]));
                i++;
            }
            textView = findViewById(i);
            wh[i-text-1]=(double)vh[i-text-1] / vvh;
            textView.setText(String.format("%.3f",wh[i-text-1]));

        }
        textView=findViewById(R.id.we1);
        text = textView.getId();
        for (int i=text;i<text+7;i++) {
            textView = findViewById(i);
            we[i-text]=(double)ve[i-text] / vve;
            textView.setText(String.format("%.3f",we[i-text]));

        }
        String checkers=check.getSelectedItem().toString();
        if (checkers.equals(checks[0])){
            double ms = 0;
            double mh = 0;
            double me = 0;
            textView=findViewById(R.id.ms);
            for (int i=0;i<10;i++){
                 ms=ms+(w[i]/u[i]);
            }
            ms=1/ms;
            textView.setText(String.format("%.3f", ms));
            textView=findViewById(R.id.rs);
            rs= (1-ms)*100;
            textView.setText(String.format("%.2f",rs));

            textView=findViewById(R.id.mh);
            for (int i=0;i<10;i++){
                mh=mh+(wh[i]/uh[i]);
            }
            mh=1/mh;
            textView.setText(String.format("%.3f", mh));
            textView=findViewById(R.id.rsh);
            rh= (1-mh)*100;
            textView.setText(String.format("%.2f",rh));

            textView=findViewById(R.id.me);
            for (int i=0;i<7;i++){
                me=me+(we[i]/ue[i]);
            }
            me=1/me;
            textView.setText(String.format("%.3f", me));
            textView=findViewById(R.id.rse);
            re= (1-me)*100;
            textView.setText(String.format("%.2f",re));

        }
        if (checkers.equals(checks[1])){
            double ms = 1;
            double mh = 1;
            double me = 1;
            textView=findViewById(R.id.ms);
            for (int i=0;i<10;i++){
                ms=ms*Math.pow(u[i],w[i]);
            }
            textView.setText(String.format("%.3f", ms));
            textView=findViewById(R.id.rs);
            rs= (1-ms)*100;
            textView.setText(String.format("%.2f",rs));

            textView=findViewById(R.id.mh);
            for (int i=0;i<10;i++){
                mh=mh*Math.pow(uh[i],wh[i]);
            }
            textView.setText(String.format("%.3f", mh));
            textView=findViewById(R.id.rsh);
            rh= (1-mh)*100;
            textView.setText(String.format("%.2f",rh));

            textView=findViewById(R.id.me);
            for (int i=0;i<7;i++){
                me=me*Math.pow(ue[i],we[i]);
            }
            textView.setText(String.format("%.3f", me));
            textView=findViewById(R.id.rse);
            re= (1-me)*100;
            textView.setText(String.format("%.2f",re));
        }
        if (checkers.equals(checks[2])){
            double ms = 0;
            double mh = 0;
            double me = 0;
            textView=findViewById(R.id.ms);
            for (int i=0;i<10;i++){
                ms=ms+(w[i]*u[i]);
            }
            textView.setText(String.format("%.3f", ms));
            textView=findViewById(R.id.rs);
            rs= (1-ms)*100;
            textView.setText(String.format("%.2f",rs));

            textView=findViewById(R.id.mh);
            for (int i=0;i<10;i++){
                mh=mh+(wh[i]*uh[i]);
            }
            textView.setText(String.format("%.3f", mh));
            textView=findViewById(R.id.rsh);
            rh= (1-mh)*100;
            textView.setText(String.format("%.2f",rh));

            textView=findViewById(R.id.me);
            for (int i=0;i<7;i++){
                me=me+(we[i]*ue[i]);
            }
            textView.setText(String.format("%.3f", me));
            textView=findViewById(R.id.rse);
            re= (1-me)*100;
            textView.setText(String.format("%.2f",re));
        }
        if (checkers.equals(checks[3])){
            double ms = 0;
            double mh = 0;
            double me = 0;
            textView=findViewById(R.id.ms);
            for (int i=0;i<10;i++){
                ms=ms+(w[i]* Math.pow(u[i],2));
            }
            ms=Math.sqrt(ms);
            textView.setText(String.format("%.3f", ms));
            textView=findViewById(R.id.rs);
            rs= (1-ms)*100;
            textView.setText(String.format("%.2f",rs));

            textView=findViewById(R.id.mh);
            for (int i=0;i<10;i++){
                mh=mh+(wh[i]* Math.pow(uh[i],2));
            }
            mh=Math.sqrt(mh);
            textView.setText(String.format("%.3f", mh));
            textView=findViewById(R.id.rsh);
            rh= (1-mh)*100;
            textView.setText(String.format("%.2f",rh));

            textView=findViewById(R.id.me);
            for (int i=0;i<7;i++){
                me=me+(we[i]* Math.pow(ue[i],2));
            }
            me=Math.sqrt(me);
            textView.setText(String.format("%.3f", me));
            textView=findViewById(R.id.rse);
            re= (1-me)*100;
            textView.setText(String.format("%.2f",re));
        }
    }

    private double stepFour(double r, double k){
        if (r<0){
            return 0;
        }
        if (r>=0&&r<=100){
            String j;
            j= String.format(Locale.ROOT,"%.3f",(double) Math.pow(r/100,k));
            return Double.parseDouble(j);
        }
        if (r>100){
            return 1;
        }
        else return 0;
    }
}
/*for (int i=0;i<7    ;i++){
        rowss=(TableRow) tabless.getChildAt(i);
        for (int j=1;j<3;j++) {
        textView.setText(String.valueOf(o[i]));
        rowss.addView(textView);
        }
        }*/