package com.example.simtj.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 버튼이 클릭된 횟수를 저장하는 변수를 선언한다.
    int clickCount = 0;

    /**
     * MainActivity 가 최초 실행될때 시작한다.
     * 자바독 주석을 확인하려면 F1 키를 누르자.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Activity 의 UI 를 R.layout.activit_main 으로 지정한다.
        setContentView(R.layout.activity_main);

        // "프로그래밍을 시작해보자!" 메세지를 잠시 보여준다.
        Toast.makeText(getApplicationContext(), "프로그래밍을 시작해보자!", Toast.LENGTH_LONG).show();

        // 레이아웃에 button 이라는 ID 로 선언된 뷰에 클릭 이벤트 리스너를 등록한다.
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 클릭 카운트를 1회 증가시킨다.
                clickCount = clickCount + 1;

                /**
                if (clickCount % 2 == 0) {
                    // 클릭 카운트가 2의 배수이면 버튼이 클릭된 횟수가 잠시 보여준다.
                    Toast.makeText(getApplicationContext(), "ClickCount : " + clickCount, Toast.LENGTH_SHORT).show();
                } else if (clickCount % 3 == 0) {
                    // 클릭 카운트가 3의 배수이면 Hello, World 메세지를 잠시 보여준다.
                    Toast.makeText(getApplicationContext(), "Hello, World!", Toast.LENGTH_SHORT).show();
                } else {
                    // 클릭 카운트가 2의 배수도 아니고 3의 배수도 아닌경우 "Hello" 메세지를 보여준다.
                    Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_SHORT).show();
                }
                **/

                // 화면에 보여줄 메세지를 저장할 변수를 선언한다.
                String text = "";

                /**
                // 클릭 횟수만큼 반복하면서 메세지를 만든다.
                for (int i = 0; i < clickCount; i++) {
                    text = text + "안녕.";
                }
                **/

                int i = 0;

                // 클릭 횟수만큼 반복하면서 메세지를 만든다.
                while (i < clickCount) {
                    text = text + "연녕.";
                }

                // 반복문으로 생성된 메세지를 잠시 보여준다.
                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
