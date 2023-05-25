///*
// * Copyright (C) 2023 The Android Open Source Project
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *      https://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//package com.example.cupcake_n.ui.ui
//
//import androidx.annotation.StringRes
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.layout.widthIn
//import androidx.compose.material.Button
//import androidx.compose.material.MaterialTheme
//import androidx.compose.material.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.res.dimensionResource
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.res.stringResource
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import com.example.cupcake_n.R
//import com.example.cupcake_n.data.DataSource
//
///**
// * Composable that allows the user to select the desired cupcake quantity and expects
// * [onNextButtonClicked] lambda that expects the selected quantity and triggers the navigation to
// * next screen
// */
//@Composable
//fun StartOrderScreen(
//    quantityOptions: List<Pair<Int, Int>>,
//    modifier: Modifier = Modifier
//){
//    Column(
//        modifier = modifier,
//        verticalArrangement = Arrangement.SpaceBetween
//    ) {
//        Column(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.spacedBy(dimensionResource(androidx.core.R.dimen.compat_button_inset_horizontal_material))
//        ) {
//            Spacer(modifier = Modifier.height(dimensionResource(androidx.core.R.dimen.compat_button_inset_horizontal_material)))
//            Image(
//                painter = painterResource(R.drawable.cupcake),
//                contentDescription = null,
//                modifier = Modifier.width(300.dp)
//            )
//            Spacer(modifier = Modifier.height(dimensionResource(com.google.android.material.R.dimen.material_emphasis_medium)))
//            Text(
//                text = stringResource(R.string.order_cupcakes),
//                style = MaterialTheme.typography.h6
//            )
//            Spacer(modifier = Modifier.height(dimensionResource(androidx.core.R.dimen.compat_button_inset_horizontal_material)))
//        }
//        Row(modifier = Modifier.weight(1f, false)) {
//            Column(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.spacedBy(
//                    dimensionResource(id = com.google.android.material.R.dimen.material_emphasis_medium)
//                )
//            ) {
//                quantityOptions.forEach { item ->
//                    SelectQuantityButton(
//                        labelResourceId = item.first,
//                        onClick = {}
//                    )
//                }
//            }
//        }
//    }
//}
//
///**
// * Customizable button composable that displays the [labelResourceId]
// * and triggers [onClick] lambda when this composable is clicked
// */
//@Composable
//fun SelectQuantityButton(
//    @StringRes labelResourceId: Int,
//    onClick: () -> Unit,
//    modifier: Modifier = Modifier
//){
//    Button(
//        onClick = onClick,
//        modifier = modifier.widthIn(min = 250.dp)
//    ) {
//        Text(stringResource(labelResourceId))
//    }
//}
//
//@Preview
//@Composable
//fun StartOrderPreview(){
//    StartOrderScreen(
//        quantityOptions = DataSource.quantityOptions,
//        modifier = Modifier.fillMaxSize().padding(dimensionResource(androidx.core.R.dimen.compat_button_inset_horizontal_material))
//    )
//}
