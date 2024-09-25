package com.example.cis183_09_16_2024_multipleintents;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class AddNewPetType extends AppCompatActivity {

    EditText et_j_newPetType;
    ArrayList<String> listOfTypes;
    Button addNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_new_pet_type);
        et_j_newPetType = findViewById(R.id.et_v_addType_typeName);
        listOfTypes = Pet.PetType.getAllPetTypes();
        addNew = findViewById(R.id.btn_v_addType_addType);
        AddNewEventListener();

    }
    private void AddNewEventListener()
    {
        ErrorCheckInput();
    }

    private void ErrorCheckInput()
    {
        if(et_j_newPetType != null)
        {
            for(int i = 0; i < listOfTypes.size(); i++)
            {
                Log.d("type", listOfTypes.get(i));
                if(et_j_newPetType.getText().toString().equals(listOfTypes.get(i)))
                {

                    Log.d("type exists", et_j_newPetType.getText() + " already exists");
                }

            }
            Log.d("list of types", listOfTypes.toString());
        }
    }


}