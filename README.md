# О программе

## Описание

Это простое Android-приложение с двумя экранами (Activity). Первое Activity содержит кнопку, при нажатии на которую пользователь переходит на второе Activity. При переходе передается параметр — фамилия пользователя, который отображается на втором экране.

### Содержание Activity 1:
- Кнопка с именем `btn1`.
- При нажатии на кнопку осуществляется переход на Activity 2 и передается параметр (Королев).

### Содержание Activity 2:
- `TextView` с текстом: «Переданный параметр: Королев».
- Значение параметра передается из Activity 1.

## Структура проекта

- **MainActivity.java**: Главное Activity, содержит кнопку для перехода на второе Activity.
- **SecondActivity.java**: Второе Activity, отображает переданный параметр.
- **activity_main.xml**: Layout-файл для `MainActivity`, содержит кнопку.
- **activity2.xml**: Layout-файл для `SecondActivity`, содержит `TextView` для отображения переданного параметра.
- **AndroidManifest.xml**: Файл манифеста, в котором зарегистрированы оба Activity.

## Установка и запуск

1. Склонируйте репозиторий или загрузите файлы проекта.
2. Откройте проект в Android Studio.
3. Убедитесь, что в `AndroidManifest.xml` правильно указаны обе активности.
4. Запустите проект на эмуляторе или реальном устройстве.

### Пример работы программы
![image](https://github.com/user-attachments/assets/e24107ca-a508-4394-8ca2-b1642b6894bd)
![image](https://github.com/user-attachments/assets/f056bb19-e58a-46bd-821b-4764e136f318)



### Пример кода

#### MainActivity.java:
```java
package com.example.laba1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); 

        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String surname = "Ваша Фамилия";
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("surname_key", surname);
                startActivity(intent);
            }
        });
    }
}
