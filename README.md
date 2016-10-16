# react-native-android-action-sheet
react-native-android-action-sheet is a JavaScript library for [React Native](https://facebook.github.io/react-native/),
it implements AcionSheet for Android relys on [AndroidActionSheet](https://github.com/zongjingyao/AndroidActionSheet).

## Installing react-native-android-action-sheet
```bash
npm install react-native-android-action-sheet --save
```

## Android
* `android/setting.gradle`

```gradle
...
include ':react-native-android-action-sheet'
project(':react-native-android-action-sheet').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-android-action-sheet/android')
```

* `android/app/build.gradle`

```gradle
dependencies {
    ...
    compile project(":react-native-android-action-sheet")
}
```

### In react-native < 0.29.0
* Register Module (in MainActivity.java)

```java
import cn.zjy.actionsheet.rn.ActionSheetPackage; 

public class MainActivity extends ReactActivity {
    ......
    @Override
    protected List<ReactPackage> getPackages() {
        return Arrays.asList(
            new MainReactPackage(),
            new ActionSheetPackage()
        );
    }
    ......
}
```

### In react-native >= 0.29.0
* Register Module (in MainApplication.java)

```java
import cn.zjy.actionsheet.rn.ActionSheetPackage; 

public class MainApplication extends Application implements ReactApplication {
    ......
    @Override
    protected List<ReactPackage> getPackages() {
        return Arrays.asList(
            new MainReactPackage(),
            new ActionSheetPackage()
        );
    }
    ......
}
```

## Usage

```js
import ActionSheet from 'react-native-android-action-sheet';

//both on iOS and Android
showActionSheetWithOptions() {
    let btns = [
      'Option 0',
      'Option 1',
      'Option 2',
      'Delete',
      'Cancel',
    ];
    let params = {
      'options': btns,
      'cancelButtonIndex': 4,
      'destructiveButtonIndex': 3,
      'title': 'ActionSheet'
    };
    ActionSheet.showActionSheetWithOptions(params, (index) => {
      console.log('showActionSheetWithOptions', index);
    });
}

//Android only
showActionSheetWithCustomOptions() {
    let title = {
      'title': 'CustomActionSheet',
      'titleColor': '#0000ff'
    };
    let cancelBtn = {
      'btnTitle': 'Cancel',
      'btnTitleColor': '#00ffff'
    };
    let optionBtns = [
      { 'btnTitle': 'Option 0', 'btnTitleColor': '#6aa84f' },
      { 'btnTitle': 'Option 1', 'btnTitleColor': '#000000' },
      { 'btnTitle': 'Option 2', 'btnTitleColor': '#7f6000' },
      { 'btnTitle': 'Delete', 'btnTitleColor': '#ff0000' }
    ];
    let params = {
      'title': title,
      'optionBtns': optionBtns,
      'cancelBtn': cancelBtn
    }
    ActionSheet.showActionSheetWithCustomOptions(params, (index) => {
      console.log('showActionSheetWithCustomOptions', index);
    });
}

```

## Screenshots
### showActionSheetWithOptions
![showActionSheetWithOptions](https://raw.githubusercontent.com/zongjingyao/react-native-android-action-sheet/master/screenshots/showActionSheetWithOptions.png)

### showActionSheetWithCustomOptions
![showActionSheetWithCustomOptions](https://raw.githubusercontent.com/zongjingyao/react-native-android-action-sheet/master/screenshots/showActionSheetWithCustomOptions.png)