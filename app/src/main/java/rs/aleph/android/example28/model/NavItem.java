package rs.aleph.android.example28.model;

import android.os.Parcel;
import android.os.Parcelable;

public class NavItem {
    private String mTitle;
    private String mSubtitle;
    private int mIcon;
 
    public NavItem(String title, String subtitle, int icon) {
        mTitle = title;
        mSubtitle = subtitle;
        mIcon = icon;
    }

	public String getmTitle() {
		return mTitle;
	}

	public void setmTitle(String mTitle) {
		this.mTitle = mTitle;
	}

	public String getmSubtitle() {
		return mSubtitle;
	}

	public void setmSubtitle(String mSubtitle) {
		this.mSubtitle = mSubtitle;
	}

	public int getmIcon() {
		return mIcon;
	}

	public void setmIcon(int mIcon) {
		this.mIcon = mIcon;
	}
    
    @Override
    public String toString() {
    	
    	return mTitle;
    }
}
