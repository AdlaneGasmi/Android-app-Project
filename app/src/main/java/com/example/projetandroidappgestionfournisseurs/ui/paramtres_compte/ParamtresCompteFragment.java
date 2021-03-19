package com.example.projetandroidappgestionfournisseurs.ui.paramtres_compte;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.projetandroidappgestionfournisseurs.R;

public class ParamtresCompteFragment extends Fragment {

    private ParamtresCompteViewModel paramtresCompteViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        paramtresCompteViewModel =
                new ViewModelProvider(this).get(ParamtresCompteViewModel.class);
        View root = inflater.inflate(R.layout.fragment_paramtres_compte, container, false);
        return root;
    }
}