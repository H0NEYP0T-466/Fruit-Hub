package com.example.fruithub.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fruithub.R

@Composable
fun Home_Screen()
{
    Column (
        modifier = Modifier.fillMaxSize().
        background(color = Color.White).
        padding(horizontal = 16.dp)
    )
    {
        Row(
            modifier =Modifier.fillMaxWidth().
            padding(vertical = 32.dp,horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "",
                tint = Color.Black,
                modifier = Modifier.size(30.dp)
            )
            Column (horizontalAlignment = Alignment.CenterHorizontally)
            {
                Image(painter = painterResource(R.drawable.shopping_basket),contentDescription = "")
                Spacer(modifier = Modifier.size(4.dp))
                Text(text = "My Basket", color = Color.Black)
            }

        }
        Text("Hello HONEYPOT! What fruit salad combo do you want today?", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Black)
        Spacer(modifier = Modifier.height(8.dp))
        Row(
           modifier = Modifier.fillMaxWidth().
           background(color = Color( 0xFFF3F1F1),
               shape = RoundedCornerShape(16.dp)).
            padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        )
        {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "",
                tint = Color.Black,
                modifier = Modifier.size(30.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text("Search for fruit salad combo", color = Color.Black)
            Spacer(modifier = Modifier.weight(1f))
            Image(painter = painterResource(R.drawable.filter_list), contentDescription = "",
                modifier = Modifier.size(20.dp))


        }
        Spacer(modifier = Modifier.height(32.dp))

        Text("Recomemded Combo", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Black)

        LazyRow (
            horizontalArrangement = Arrangement.spacedBy(16.dp) ,modifier = Modifier.padding(vertical = 16.dp)
        ){

            }
        }
    }

