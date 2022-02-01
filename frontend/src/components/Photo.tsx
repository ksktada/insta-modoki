import React from 'react';

function Photo({photoData}: {photoData: string}) {
    return (
        <li>
            <img src={photoData} alt=''></img>
        </li>
    )
}

export default Photo;