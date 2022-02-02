import React from 'react';

function Photo({photoData}: {photoData: string}) {
    return (
        <li>
            <img src='' alt={photoData}></img>
        </li>
    )
}

export default Photo;