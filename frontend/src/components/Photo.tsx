import React from 'react';

function Photo({photoData}: {photoData: string}) {
    return (
        <div>
            <img src={photoData} alt=''></img>
        </div>
    )
}

export default Photo;