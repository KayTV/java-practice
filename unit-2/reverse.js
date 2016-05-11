function reverse(str) {
  var reversedString = '';
  for(var i = str.length; i > 0; i--) {
    reversedString  += str[i];
  }
  return reversedString;
}
