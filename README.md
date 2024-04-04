# LandscapeViewCalendar

LandscapeViewCalendar is a customizable personalized calendar library with a horizontal layout. Users can easily select dates by clicking on them, 
which are then highlighted for visual confirmation. The selected date is returned for further use, 
providing seamless integration into your applications.

[![](https://jitpack.io/v/Bhupendrapatel98/LandscapeViewCalendar.svg)](https://jitpack.io/#Bhupendrapatel98/LandscapeViewCalendar)   [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

<img src="https://github.com/Bhupendrapatel98/LandscapeViewCalendar/assets/55411086/1c28b788-75e0-4750-b599-c32b74941377" alt="Image 1" width="300" height="150">

## How to Use
To integrate LandscapeViewCalendar into your project, follow these simple steps:

## Step 1: Add the JitPack repository to your build file
Add the following lines at the end of your root build.gradle file:
```
repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
```
## Step 2: Add the dependency
Add the dependency to your app-level build.gradle file:

```
dependencies {
    implementation 'com.github.Bhupendrapatel98:LandscapeViewCalendar:version'
}
```

Replace **version** with the specific version you want to use.

## Step 3: Implement in your XML layout
You can use the LandscapeViewCalendar in your XML layout like this:

```
<com.app.horizontalcalendarlib.HorizontalCalendarView
    android:id="@+id/horizontalCalendarView"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
/>
```
## Step 4: Set up date selection listener
To handle date selection, implement the DateSelectedListener interface and set it as the listener for date selection:

```
// Set listener for date selection
horizontalCalendarView.setOnDateSelectedListener(object : DateSelectedListener {
    override fun onDateSelected(date: Date?) {
        // Handle date selection
        // You can use the selected date here
        Log.d("SeletedDate", "onDateSelected: $date")
    }
})
```

## Contributions
Contributions are welcome! If you encounter any bugs or have suggestions for improvements, feel free to open an issue or submit a pull request. 
Let's make LandscapeViewCalendar even better together!

Now you're all set to use the LandscapeViewCalendar in your project. Enjoy the seamless date selection experience!

## License
The LandscapeViewCalendar library is distributed under the MIT license. See the [LICENSE](https://github.com/Bhupendrapatel98/LandscapeViewCalendar/blob/master/LICENSE.md) file for details.

