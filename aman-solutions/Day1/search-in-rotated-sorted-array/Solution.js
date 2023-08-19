/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
 var search = function(nums, target) {
    let index=-1;
    // for(let i=0;i<nums.length;i++) {
    //     if(nums[i] == target){
    //         index=i;
    //         break;
    //     }
    // }
    // return index;
    if(nums[0] == target )
        return 0;
    else if(nums[1] == target)
        return 1;
    
    let low = 0;
    let high = nums.length-1; 
    let counter = 0;
    while(low<=high) {
        let mid = low + (high - low)/2;
        if(nums[mid] >= target)
            high = mid;
        else 
            low = mid;
        if(counter++>10)
        {
            System.out.print("force break");
            break;
        }
    }
    return mid;
};
console.log(search([4,5,6,7,0,1,2],0))