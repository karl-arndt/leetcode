/**
 * @param {number} x
 * @return {number}
 */
var mySqrt = function(x) {
    let left = 0;
    let right = x;
    let res = 0;
    while (left <= right) {
            let middle = Math.floor(left + ((right - left) / 2));
            if (middle * middle > x) {
                right = middle - 1;
            } else if (middle * middle < x) {
                left = middle + 1;
                res = middle;
            } else {
                return middle;
            }
        }
        return res;
};