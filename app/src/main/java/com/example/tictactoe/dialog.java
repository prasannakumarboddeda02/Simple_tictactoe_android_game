package com.example.tictactoe;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class dialog extends Dialog {
    private final String message;
    private MainActivity mainActivity;
    public dialog(@NonNull Context context,String message,MainActivity mainActivity)
    {
        super(context);
        this.message=message;
        this.mainActivity=mainActivity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog);

        final TextView dialogMessage=findViewById(R.id.dialogMessage);
        final Button startAgn=findViewById(R.id.startAgainBtn);
        dialogMessage.setText(message);

        startAgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity.reset(view);
                dismiss();
            }
        });
    }
}
