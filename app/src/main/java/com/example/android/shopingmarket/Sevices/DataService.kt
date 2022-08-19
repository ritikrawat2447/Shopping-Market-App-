 package com.example.android.shopingmarket.Sevices

import com.example.android.shopingmarket.Models.Products

object DataService {

    val categories = listOf(
        Products("SHIRTS" , "", "shirtimage"),
        Products("HOODIES" ,"", "hoodieimage"),
        Products("HATS","" , "hatimage"),
        Products("DIGITAL","","digitalgoodsimage"),
            Products("SHIRTS" ,"", "shirtimage"),
            Products("HOODIES" ,"", "hoodieimage"),
            Products("HATS" ,"", "hatimage"),
            Products("DIGITAL","","digitalgoodsimage"),
            Products("SHIRTS" ,"", "shirtimage"),
        Products("HOODIES","" , "hoodieimage"),
        Products("HATS","" , "hatimage"),
        Products("DIGITAL","","digitalgoodsimage")

    )

    val hats = listOf(
        Products("Slopes Graphic" , "$18",  "hat1" ),
        Products("Black Slopes" , "$20","hat2"),
        Products("White Slopes" , "$22", "hat3"),
        Products("SLopes Snapback","$24","hat4"),
            Products("Slopes Graphic" , "$18",  "hat1" ),
            Products("Black Slopes" , "$20","hat2"),
            Products("White Slopes" , "$22", "hat3"),
            Products("SLopes Snapback","$24","hat4"),
            Products("Slopes Graphic" , "$18",  "hat1" ),
            Products("Black Slopes" , "$20","hat2"),
            Products("White Slopes" , "$22", "hat3"),
            Products("SLopes Snapback","$24","hat4")
    )

    val hoodies = listOf(
        Products("SLopes Gray" , "$28",  "hoodie1" ),
        Products("SLopes Red" , "$20","hoodie2"),
        Products("SLopes Gray" , "$22", "hoodie3"),
        Products("SLopes Black","$34","hoodie4"),
            Products("SLopes Gray" , "$28",  "hoodie1" ),
            Products("SLopes Red" , "$20","hoodie2"),
            Products("SLopes Gray" , "$22", "hoodie3"),
            Products("SLopes Black","$34","hoodie4"),
            Products("SLopes Gray" , "$28",  "hoodie1" ),
            Products("SLopes Red" , "$20","hoodie2"),
            Products("SLopes Gray" , "$22", "hoodie3"),
            Products("SLopes Black","$34","hoodie4")
    )
    val shirts = listOf(
        Products("Slopes Black" , "$30",  "shirt1" ),
        Products("SLopes Light Grey" , "$20","shirt2"),
        Products("SLopes Red" , "$32", "shirt3"),
        Products("SLopes Hustle","$29","shirt4"),
        Products("Kickflip Studios" , "$50" , "shirt5"  ),
            Products("Slopes Black" , "$30",  "shirt1" ),
            Products("SLopes Light Grey" , "$20","shirt2"),
            Products("SLopes Red" , "$32", "shirt3"),
            Products("SLopes Hustle","$29","shirt4"),
            Products("Kickflip Studios" , "$50" , "shirt5"  ),
            Products("Slopes Black" , "$30",  "shirt1" ),
            Products("SLopes Light Grey" , "$20","shirt2"),
            Products("SLopes Red" , "$32", "shirt3"),
            Products("SLopes Hustle","$29","shirt4"),
            Products("Kickflip Studios" , "$50" , "shirt5"  )
    )

    val digitalGood = listOf<Products>()

    fun getProducts(category : String) : List<Products> {
        return when (category ){ // we can also write return before each output ex : -> return shirts
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }
}