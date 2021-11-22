package com.rafsan.picsumphotoapp.utils

import com.rafsan.picsumphotoapp.BuildConfig

class Constants {
    companion object {
        val BASE_URL = getBaseUrlByProductFlavor()
        const val QUERY_PER_PAGE = 20
        const val DEFAULT_PAGE_INDEX = 1
        const val TAG = "PicsumPhotoApp"
        const val IMAGE_QUALITY = 80

        private fun getBaseUrlByProductFlavor(): String {
            if (BuildConfig.IS_PROD) {
                //For prod
                return "https://picsum.photos/"
            } else {
                return "https://picsum.photos/"
            }
        }
    }
}