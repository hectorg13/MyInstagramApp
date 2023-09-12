package com.smartsolution.myinstagramapp.data

import com.smartsolution.myinstagramapp.R

class PostsProvider{

    companion object{
        val postLists = listOf<PostData>(
            PostData("discoveryplanet", R.drawable.img_a,"description",2,"2 days ago",3),
            PostData("wonderfulworld",R.drawable.img_b,"description",2,"2 days ago",3),
            PostData("discoveryplanet",R.drawable.img_c,"description",2,"2 days ago",3),
            PostData("wonderfulworld",R.drawable.img_d,"description",2,"2 days ago",3),
            PostData("wonderfulworld",R.drawable.img_e,"description",2,"2 days ago",3),
            PostData("wonderfulworld", R.drawable.img_a,"description",2,"2 days ago",3),
            PostData("wonderfulworld",R.drawable.img_b,"description",2,"2 days ago",3),
            PostData("discoveryplanet",R.drawable.img_c,"description",2,"2 days ago",3),
            PostData("wonderfulworld",R.drawable.img_d,"description",2,"2 days ago",3),
            PostData("wonderfulworld",R.drawable.img_e,"description",2,"2 days ago",3),
            PostData("discoveryplanet",R.drawable.img_e,"description",2,"2 days ago",3)
        )

        val storiesLists = listOf<PostData>(
            PostData("usera", R.drawable.img_circle_1,"description",2,"2 days ago",3),
            PostData("usera", R.drawable.img_circle_2,"description",2,"2 days ago",3),
            PostData("usera", R.drawable.img_circle_3,"description",2,"2 days ago",3),
            PostData("usera", R.drawable.img_circle_4,"description",2,"2 days ago",3),
            PostData("usera", R.drawable.img_circle_5,"description",2,"2 days ago",3),
            PostData("usera", R.drawable.img_circle_6,"description",2,"2 days ago",3),
            PostData("usera", R.drawable.img_circle_7,"description",2,"2 days ago",3),
            PostData("usera", R.drawable.img_circle_8,"description",2,"2 days ago",3),

        )
    }

}