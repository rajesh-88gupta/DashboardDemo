package com.agro.dashboarddemo



import android.os.Bundle
import android.widget.Toast

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout


@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DashBoard()
        }

    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Preview
    @Composable
    fun DashBoard() {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(color = Color(android.graphics.Color.parseColor("#ede7f8")))
                .padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(modifier = Modifier.fillMaxWidth()) {
                val borderWidth = 2.dp
                Image(
                    painter = painterResource(id = R.drawable.circle_profile),
                    contentDescription = stringResource(id = R.string.dog_content_description),
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(100.dp)
                        .border(
                            BorderStroke(borderWidth, Color.Red),
                            CircleShape
                        )
                        .padding(borderWidth)
                        .clip(CircleShape)
                )
                Column(
                    modifier = Modifier
                        .height(100.dp)
                        .padding(start = 14.dp)
                        .weight(0.7f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(text = "Rajesh Gupta", color = Color.Black, fontSize = 20.sp)
                    Text(text = "rajesh.gupta06@gmail.com", color = Color.Black, fontSize = 16.sp)
                }
            }
            var text by rememberSaveable { mutableStateOf("") }

            TextField(
                value = text, onValueChange = {
                    text = it
                },
                label = { Text(text = " Searching for ....") },
                trailingIcon = {
                    Box(
                        modifier = Modifier
                            .padding(end = 6.dp)
                            .height(45.dp)
                            .width(45.dp)
                            .background(
                                Color(android.graphics.Color.parseColor("#fe5b52")),
                                shape = RoundedCornerShape(10.dp)
                            )
                    )
                    Image(
                        painter = painterResource(id = R.drawable.baseline_manage_search_24),
                        contentDescription = null,
                        modifier = Modifier
                            .size(35.dp)
                            .padding(end = 6.dp)
                    )
                },
                shape = RoundedCornerShape(10.dp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent,
                    textColor = Color.LightGray,
                    unfocusedLabelColor = Color.LightGray
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 32.dp)
                    .background(Color.White, CircleShape)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp)
            ) {
                Column(
                    Modifier
                        .weight(.5f)
                        .padding(end = 12.dp)
                        .background(
                            Color.White,
                            shape = RoundedCornerShape(20.dp)
                        )
                        .padding(top = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier
                            .width(75.dp)
                            .height(65.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#7868e5")),
                                shape = RoundedCornerShape(20.dp)
                            ), contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.baseline_message_24),
                            contentDescription = null
                        )
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(40.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#Dad8ff")),
                                shape = RoundedCornerShape(bottomEnd = 20.dp, bottomStart = 20.dp)
                            ), contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "message",
                            fontWeight = FontWeight.Bold,
                            color = Color(android.graphics.Color.parseColor("#7868e5"))
                        )
                    }
                }
                Column(
                    Modifier
                        .weight(.5f)
                        .padding(start = 12.dp)
                        .background(
                            Color.White,
                            shape = RoundedCornerShape(20.dp)
                        )
                        .padding(top = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier
                            .width(75.dp)
                            .height(65.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#7868e5")),
                                shape = RoundedCornerShape(20.dp)
                            ), contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.baseline_bug_report_24),
                            contentDescription = null
                        )
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(40.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#Dad8ff")),
                                shape = RoundedCornerShape(bottomEnd = 20.dp, bottomStart = 20.dp)
                            ), contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Report",
                            fontWeight = FontWeight.Bold,
                            color = Color(android.graphics.Color.parseColor("#7868e5"))
                        )
                    }
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp)
            ) {
                Column(
                    Modifier
                        .weight(.5f)
                        .padding(end = 12.dp)
                        .background(
                            Color.White,
                            shape = RoundedCornerShape(20.dp)
                        )
                        .padding(top = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier
                            .width(75.dp)
                            .height(65.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#7868e5")),
                                shape = RoundedCornerShape(20.dp)
                            ), contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.baseline_inbox_24),
                            contentDescription = null
                        )
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(40.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#Dad8ff")),
                                shape = RoundedCornerShape(bottomEnd = 20.dp, bottomStart = 20.dp)
                            ), contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Inbox",
                            fontWeight = FontWeight.Bold,
                            color = Color(android.graphics.Color.parseColor("#7868e5"))
                        )
                    }
                }
                Column(
                    Modifier
                        .weight(.5f)
                        .padding(start = 12.dp)
                        .background(
                            Color.White,
                            shape = RoundedCornerShape(20.dp)
                        )
                        .padding(top = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier
                            .width(75.dp)
                            .height(65.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#7868e5")),
                                shape = RoundedCornerShape(20.dp)
                            ), contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.baseline_library_books_24),
                            contentDescription = null
                        )
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(40.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#Dad8ff")),
                                shape = RoundedCornerShape(bottomEnd = 20.dp, bottomStart = 20.dp)
                            ), contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Library",
                            fontWeight = FontWeight.Bold,
                            color = Color(android.graphics.Color.parseColor("#7868e5"))
                        )
                    }
                }
            }
            ConstraintLayout(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 36.dp)
                    .height(120.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Color(android.graphics.Color.parseColor("#BFA3EF")),
                                Color(android.graphics.Color.parseColor("#7E57c2"))
                            )
                        ),
                        shape = RoundedCornerShape(20.dp)
                    )
            ) {
                val (img, text1, text2) = createRefs()
                Image(
                    painter = painterResource(id = R.drawable.circle),
                    contentDescription = null,
                    modifier = Modifier.constrainAs(img) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                    }
                )
                Text(text = "To Get Unlimted", fontSize = 20.sp, fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .constrainAs(text1) {
                            top.linkTo(parent.top)
                            start.linkTo(img.end)
                            end.linkTo(parent.end)
                        }
                )
                Text(text = "Upgrade Your Account", fontSize = 20.sp, fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .constrainAs(text2) {
                            top.linkTo(text1.bottom)
                            start.linkTo(text1.start)
                            end.linkTo(text1.end)
                            bottom.linkTo(parent.bottom)
                        }
                )
            }

        }
    }

    data class BottomMenuItem(val label: String, val icon: Painter)

    @Composable
    private fun prepareBottomMenu(): List<BottomMenuItem> {
        val bottomMenuItemList = arrayListOf<BottomMenuItem>()
        bottomMenuItemList.add(
            BottomMenuItem(
                label = "Home",
                icon = painterResource(id = R.drawable.baseline_maps_home_work_24)
            )
        )
        bottomMenuItemList.add(
            BottomMenuItem(
                label = "Profile",
                icon = painterResource(id = R.drawable.baseline_self_improvement_24)
            )
        )
        bottomMenuItemList.add(
            BottomMenuItem(
                label = "Support",
                icon = painterResource(id = R.drawable.baseline_support_agent_24)
            )
        )
        bottomMenuItemList.add(
            BottomMenuItem(
                label = "Settings",
                icon = painterResource(id = R.drawable.baseline_settings_suggest_24)
            )
        )
        return bottomMenuItemList
    }

    @Composable
    fun MyBottomBar() {
        val bottomMenuItemList = prepareBottomMenu()
        val contextForToast = LocalContext.current.applicationContext
        var selectedItem by remember {
            mutableStateOf("Profile")
        }

        androidx.compose.material.BottomAppBar(cutoutShape = CircleShape, backgroundColor = Color.White, elevation = 3.dp) {
            bottomMenuItemList.forEachIndexed { index, bottomMenuItem ->
                if (index == 2) {
                    BottomNavigationItem(
                        selected = false,
                        onClick = { /*TODO*/ },
                        icon = { /*TODO*/ },
                        enabled = false
                    )
                }
                BottomNavigationItem(selected = (selectedItem == bottomMenuItem.label), onClick = {
                    selectedItem = bottomMenuItem.label
                    Toast.makeText(contextForToast, bottomMenuItem.label, Toast.LENGTH_SHORT).show()
                },
                    icon = {
                        Icon(
                            painter = bottomMenuItem.icon,
                            contentDescription = bottomMenuItem.label,
                            modifier = Modifier
                                .height(20.dp)
                                .width(20.dp)
                        )
                    }, label = {
                        Text(text = bottomMenuItem.label, modifier = Modifier.padding(top = 14.dp))
                    },
                    alwaysShowLabel = true,
                    enabled = true)
            }
        }
    }

    @Preview
    @Composable
    fun MyUi(){
        val scaffoldState= rememberScaffoldState()
        androidx.compose.material.Scaffold(bottomBar ={MyBottomBar()},
            floatingActionButton = {
                FloatingActionButton(onClick = { /*TODO*/ }, contentColor = Color.White, containerColor = Color(android.graphics.Color.parseColor("#Fe5b52"))) {
                
                    Icon(painter = painterResource(id = R.drawable.shopping_cart_24), contentDescription = "add", modifier = Modifier
                        .height(30.dp)
                        .width(30.dp))
                }
            },
            scaffoldState=scaffoldState,
            isFloatingActionButtonDocked = true,
            floatingActionButtonPosition= androidx.compose.material.FabPosition.Center){
            Column(modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues = it),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                DashBoard()

            }
        }
    }
}

