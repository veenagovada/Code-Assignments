import React from 'react';
const userinput = (props) => {

    return(
        <div>
            <p>User Name</p>
            <input type="text" onChange={props.click} value={props.presentName}/>

        </div>

    );

}
export default userinput;