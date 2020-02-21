package android.com.viper.ui.catDetail

import android.com.viper.model.response.CatDetailModel
import android.com.viper.ui.errorhandling.NetworkView

/**
 * View is responsible for displaying the user interface and sends events provided by the user to Presenter
 * Ideally, our View also not contain any logic, but only pass events to Presenter from the user and show what Presenter will say.
 * Due to this, the testability is being much improved
 */
interface CatDetailViewCallBacks : NetworkView {
  fun showCatImageView(catDetailModel: CatDetailModel)
}