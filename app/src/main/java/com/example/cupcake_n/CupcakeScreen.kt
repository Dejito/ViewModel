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
//package com.example.cupcake_n
//
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material.*
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.ArrowBack
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.collectAsState
//import androidx.compose.runtime.getValue
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.res.stringResource
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.rememberNavController
//import com.example.cupcake_n.ui.ui.OrderViewModel
//import androidx.lifecycle.viewmodel.compose.viewModel
//
//
///**
// * Composable that displays the topBar and displays back button if back navigation is possible.
// */
//@Composable
//fun CupcakeAppBar(
//    canNavigateBack: Boolean,
//    navigateUp: () -> Unit,
//    modifier: Modifier = Modifier
//) {
//    TopAppBar(
//        title = { Text(stringResource(id = R.string.app_name)) },
//        modifier = modifier,
//        navigationIcon = {
//            if (canNavigateBack) {
//                IconButton(onClick = navigateUp) {
//                    Icon(
//                        imageVector = Icons.Filled.ArrowBack,
//                        contentDescription = stringResource(R.string.back_button)
//                    )
//                }
//            }
//        }
//    )
//}
//
//@Composable
//fun CupcakeApp(
//    viewModel: OrderViewModel = viewModel(),
//    navController: NavHostController = rememberNavController()
//) {
//    Scaffold(
//        topBar = {
//            CupcakeAppBar(
//                canNavigateBack = false,
//                navigateUp = { /* TODO: implement back navigation */ }
//            )
//        }
//    ) { paddingValues ->
//        val uiState by viewModel.uiState.collectAsState()
//        Column(
//            modifier = Modifier.padding(paddingValues)
//        ) {
//
//        }
//    }
//}
