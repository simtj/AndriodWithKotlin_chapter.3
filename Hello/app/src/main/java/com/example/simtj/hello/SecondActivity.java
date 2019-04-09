package com.example.simtj.hello;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    /*
    // testButton1 의 클릭된 횟수를 저장하는 변수를 선언한다.
    int clickCount1 = 0;
    // testButton2 의 클릭된 횟수를 저장하는 변수를 선언한다.
    int clickCount2 = 0;
    */

    Car car1 = new Car(3, 100, 4);
    SportsCar car2 = new SportsCar(10, 50, 8);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        /*
        // "프로그래밍을 시작해보자!" 메시지를 잠시 보여준다.
        Toast.makeText(getApplicationContext(), "프로그래밍을 시작해보자!", Toast.LENGTH_LONG).show();

        findViewById(R.id.testButton1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                clickCount1 = clickCount1+1;

                //showMessage(clickCount1);
                Toast.makeText(getApplicationContext(), getMessage(clickCount1), Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.testButton2).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                clickCount2 = clickCount2+1;

                //showMessage(clickCount2);
                Toast.makeText(getApplicationContext(), getMessage(clickCount2), Toast.LENGTH_SHORT).show();
            }
        });
        */

        Toast.makeText(getApplicationContext(), "프로그래밍을 시작해보자!", Toast.LENGTH_LONG).show();

        findViewById(R.id.testButton1).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                car1.accelerationPedal();
                car2.accelerationPedal();
                String info = "car1: "+ car1.getCurrentSpeedText() + ", car2: "+ car2.getCurrentSpeedText();
                Toast.makeText(getApplicationContext(), info, Toast.LENGTH_SHORT).show();

                car2.openSunRoof();
                Toast.makeText(getApplicationContext(), car2.getSunRoofInfo(), Toast.LENGTH_SHORT).show();

            }
        });

        findViewById(R.id.testButton2).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                car1.brakePedal();
                car2.brakePedal();
                String info = "car1: "+ car1.getCurrentSpeedText() + ", car2: "+ car2.getCurrentSpeedText();
                Toast.makeText(getApplicationContext(), info, Toast.LENGTH_SHORT).show();

                car2.closeSunRoof();
                Toast.makeText(getApplicationContext(), car2.getSunRoofInfo(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    void showMessage(int clickCount) {

        if (clickCount % 2 == 0) {
            Toast.makeText(getApplicationContext(), "클릭 횟수 : " + clickCount, Toast.LENGTH_SHORT).show();
        } else if (clickCount % 3 == 0) {
            Toast.makeText(getApplicationContext(), "Hello, World!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_SHORT).show();
        }

    }

    String getMessage(int clickCount) {
        if (clickCount % 2 == 0) {
            return "클릭횟수 :" + clickCount;
        } else if (clickCount % 3 == 0) {
            return  "Hello, Korea!";
        } else {
            return "Hello";
        }
    }

}
