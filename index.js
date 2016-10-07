'use strict';

import { 
    Platform, 
    ActionSheetIOS,
    NativeModules
} from 'react-native';
const AndroidActionSheet = NativeModules.AndroidActionSheet;

const ActionSheet = Platform.OS === 'ios' ? ActionSheetIOS : AndroidActionSheet;

export default ActionSheet;