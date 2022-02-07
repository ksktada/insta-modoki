import React from 'react';


type Props = {
    photoData: string
}

const Photo: React.FC<Props> = (props) => {
    return (
        <li>
            <img src='' alt={props.photoData}></img>
        </li>
    )
} 

export default Photo;